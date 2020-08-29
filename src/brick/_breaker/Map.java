package brick._breaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Map extends Components {

    private int[][] theMap;
    private int brickWidth, brickHeight;
    public final int hor_Padding = 80, ver_Padding = 50;
    private int i, j;

    public Map(int row, int col) {
        initial(row, col);
        brickWidth = (Brick_Breaker.Width - 2 * hor_Padding) / col;
        brickHeight = (Brick_Breaker.Height / 2 - ver_Padding * 2) / row;
    }

    public void initial(int row, int col) {
        theMap = new int[row][col];
        for (i = 0; i < theMap.length; i++) {
            for (j = 0; j < theMap[0].length; j++) {
                int random = (int) (Math.random() * 3 + 1); //making block life randomly
                theMap[i][j] = random;
            }
        }

        theMap[2][1] = 4; //feature block
        theMap[2][5] = 5; //feature block
    }

    public void draw(Graphics2D a) {

        for (i = 0; i < theMap.length; i++) {
            for (j = 0; j < theMap[0].length; j++) {
                if (theMap[i][j] > 0) {

                    if (theMap[i][j] == 1) {
                        a.setColor(new Color(0, 200, 200));
                    }

                    if (theMap[i][j] == 2) {
                        a.setColor(new Color(00, 150, 150));
                    }

                    if (theMap[i][j] == 3) {
                        a.setColor(new Color(00, 100, 100));
                    }

                    if (theMap[i][j] == Feature.paddleExpandMod) {
                        a.setColor(Feature.mod1Color);
                    }

                    if (theMap[i][j] == Feature.ballFastMod) {
                        a.setColor(Feature.mod2Color);
                    }

                    a.fillRoundRect(j * brickWidth + hor_Padding, i * brickHeight + ver_Padding, brickWidth, brickHeight, 10, 10);
                    a.setStroke(new BasicStroke(2));
                    a.setColor(Color.WHITE);
                    a.drawRect(j * brickWidth + hor_Padding, i * brickHeight + ver_Padding, brickWidth, brickHeight);
                }

            }
        }
    }

    public int[][] getMap() {
        return theMap;
    }

    public void setBrick(int row, int col, int value) {
        theMap[row][col] = value;
    }

    public boolean win() {
        boolean winner = false;
        int availableBrick = 0;

        for (i = 0; i < theMap.length; i++) {
            for (j = 0; j < theMap[0].length; j++) {
                availableBrick += theMap[i][j];
            }
        }

        if (availableBrick == 0) {
            winner = true;
        }

        return winner;
    }

    public int getbrickWidth() {
        return brickWidth;
    }

    public int getbrickHeight() {
        return brickHeight;
    }

    public void hitMap(int row, int col) {
        theMap[row][col] -= 1; //decreasing block life after get hitted by ball
        if (theMap[row][col] < 0) {
            theMap[row][col] = 0;
        }
    }

    public void drawWinner(Graphics2D a) {
        a.setColor(Color.BLUE);
        a.setFont(new Font("Courier New", Font.BOLD, 50));
        a.drawString("Winner Winner", 150, 250);
        a.setColor(Color.BLACK);
        a.setFont(new Font("Curier New", Font.BOLD, 15));
        a.drawString("Press Enter For Start", 250, 300);
    }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
