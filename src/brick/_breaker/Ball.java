package brick._breaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball extends Components {

	private double x, y, directX, directY;
	private int ballSize = 15;
	private boolean fastModON, loser = false;
	private long timer;

	public Ball(double speedInDirectX, double speedInDirectY) {
		x = (int) (Math.random() * 200 + 100);
		y = 200;

		this.directX = speedInDirectX;
		this.directY = speedInDirectY;
	}

	public void update() {
		setPosition();
		if (fastModON == true && (System.nanoTime() - timer) / 1000 > 4000000) {
			directX = directX / 2;
			directY = directY / 2;
			fastModON = false;
		}
	}

	public void setPosition() {

		x += directX;
		y += directY;

		if (x < 0) {
			directX = -directX;
		}
		if (y < 0) {
			directY = -directY;
		}
		if (x > Brick_Breaker.Width - ballSize) {
			directX = -directX;
		}
		if (y > Brick_Breaker.Height - ballSize) {
			directY = -directY;
		}

	}

	public boolean looser() {

		if (y > Brick_Breaker.Height - ballSize * 2) {
			loser = true;
		}

		return loser;
	}

	public void setLooser(boolean loser) {
		this.loser = loser;
	}

	public boolean getLooser() {
		return loser;
	}

	public void draw(Graphics2D a) {
		a.setColor(Color.RED);
		// a.setStroke(new BasicStroke(2));
		a.fillOval((int) x, (int) y, ballSize, ballSize);
	}

	public Rectangle getRect() {
		return new Rectangle((int) x, (int) y, ballSize, ballSize);
	}

	public void setDirectY(double DY) {
		directY = DY;
	}

	public double getDirectY() {
		return directY;
	}

	public void drawLooser(Graphics2D a) {
		a.setColor(Color.BLUE);
		a.setFont(new Font("Courier New", Font.BOLD, 50));
		a.drawString("Looser Looser", 150, 250);
		a.setColor(Color.BLACK);
		a.setFont(new Font("Courier New", Font.BOLD, 15));
		a.drawString("Press Enter For Start", 250, 300);
	}

	public void setdirectXY(double directX, double directY) {
		this.directX = directX;
		this.directY = directY;
		fastModON = true;
		setTimer();
	}

	public double getX() {
		return directX;
	}

	public double getY() {
		return directY;
	}

	public void setTimer() {
		timer = System.nanoTime();
	}

	public long getTimer() {
		return timer;
	}

	public void setfastModON(boolean fastModON) {
		this.fastModON = fastModON;
	}

}
