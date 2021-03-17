package brick._breaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle extends Components {

	private double initialPositionInXAxis;
	private int paddleWidth, paddleHeight, fixedPaddleWidth, mousePos;
	public final int positionInYAxis = Brick_Breaker.Height - 100;
	private long timer;
	private boolean paddleModON, mouseMode, keyboardMode, rightPress, leftPress;

	public Paddle(int width, int height) {
		paddleWidth = width;
		fixedPaddleWidth = width;
		paddleHeight = height;
		rightPress = leftPress = false;
		initialPositionInXAxis = Brick_Breaker.Width / 2 - paddleWidth / 2;
	}

	public void update() {
		if (keyboardMode == true) {
			if (rightPress == true) {
				initialPositionInXAxis += 50 * .5;
				rightPress = false;
			} else if (leftPress == true) {
				initialPositionInXAxis -= 50 * .5;
				leftPress = false;
			}
		}

		if (initialPositionInXAxis > Brick_Breaker.Width - (paddleWidth + 20)) {
			initialPositionInXAxis = Brick_Breaker.Width - (paddleWidth + 20);
		} else if (initialPositionInXAxis < 10) {
			initialPositionInXAxis = 5;
		}

		if (mouseMode == true) {
			keyboardMode = false;
			initialPositionInXAxis += (mousePos - initialPositionInXAxis) * .1; // make paddle move smooth by different
																				// between mouse and paddle distance
		}

		if ((System.nanoTime() - timer) / 1000 > 4000000) { // using nanotime for run mod in a giving time
			paddleWidth = fixedPaddleWidth;
			paddleModON = false;
		}

	}

	public void draw(Graphics2D a) {
		a.setColor(Color.DARK_GRAY);
		a.fillRoundRect((int) initialPositionInXAxis, positionInYAxis, paddleWidth, paddleHeight, 10, 10);
		if (paddleModON == true) {
			a.setColor(Color.YELLOW);
			a.setFont(new Font("Roboto", Font.BOLD, 11));
			a.drawString("Finish: " + (4 - ((System.nanoTime() - timer) / 1000000000)),
					(int) initialPositionInXAxis + 50, positionInYAxis + 9);
		}

	}

	public void mouseMoved(int xPosMouse) {
		mouseMode = true;
		mousePos = xPosMouse - paddleWidth / 2;
		if (mousePos > Brick_Breaker.Width - paddleWidth) {
			mousePos = Brick_Breaker.Width - (paddleWidth + 10);
		}
	}

	public void keyPressed(int keyPress) {
		mouseMode = false;
		keyboardMode = true;
		if (keyPress == KeyEvent.VK_RIGHT) {
			rightPress = true;
		} else if (keyPress == KeyEvent.VK_LEFT) {
			leftPress = true;
		}
	}

	public Rectangle getRect() {
		return new Rectangle((int) initialPositionInXAxis, positionInYAxis, paddleWidth, paddleHeight);
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
