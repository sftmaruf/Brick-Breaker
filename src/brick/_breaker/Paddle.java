package brick._breaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle extends Components {

    private double x;
    private int paddleWidth, paddleHeight, fixedWidth, posMouse, keyPress;
    public final int posY = Brick_Breaker.Height - 100;
    private long timer;
    private boolean paddleModON, mouseMode , keyMode , right, left;

    public Paddle(int width, int height) {
        paddleWidth = width;
        fixedWidth = width;
        paddleHeight = height;
        right = left = true;
        mouseMode = false;

        x = Brick_Breaker.Width / 2 - paddleWidth / 2;
    }

    public void update() {

        if (right == true) {
            
            x += 50 * .5;
            right = false;
            
        } else if (left == true) {
            
            x -= 50 * .5;
            left = false;
            
        }

        if (x > Brick_Breaker.Width - paddleWidth) {
            x = Brick_Breaker.Width - (paddleWidth + 10);
        }else if(x < 10){
            x = 5 ;
        }
        
        if(mouseMode == true){
            keyMode = false ;
            x += (posMouse - x) * .1;           //make paddle move smooth by differet between mouse and paddle distance
  //        System.out.println(posMouse);       // for print mouse position

            
        }
           
        if ((System.nanoTime() - timer) / 1000 > 4000000) {   //using nanotime for run mod in a giving time
            paddleWidth = fixedWidth;
            paddleModON = false;
        }

    }

    public void draw(Graphics2D a) {
        a.setColor(Color.DARK_GRAY);
        a.fillRoundRect((int) x, posY, paddleWidth, paddleHeight, 10, 10);
        if (paddleModON == true) {
            a.setColor(Color.YELLOW);
            a.setFont(new Font("Courier New", Font.BOLD, 14));
            a.drawString("Finish: " + (4 - ((System.nanoTime() - timer) / 1000000000)), (int) x + 30, posY + 9);
        }

    }

    public void mouseMoved(int xPosMouse) {
        mouseMode = true ; 
        posMouse = xPosMouse - paddleWidth / 2;

        if (posMouse > Brick_Breaker.Width - paddleWidth) {
            posMouse = Brick_Breaker.Width - (paddleWidth + 10);
        }
    }

    public void keyPressed(int keyPress) {
        mouseMode = false;
        keyMode = true;
        if (keyPress == KeyEvent.VK_RIGHT) {
            right = true;
        } else if (keyPress == KeyEvent.VK_LEFT) {
            left = true;
        }
    }

    public Rectangle getRect() {
        return new Rectangle((int) x, posY, paddleWidth, paddleHeight);
    }

    public void setWidth(int width) {
        paddleWidth = width;
        paddleModON = true;
        setTimer();
    }

    public int getWidth() {
        return paddleWidth;
    }

    public void setTimer() {
        timer = System.nanoTime();
    }
}
