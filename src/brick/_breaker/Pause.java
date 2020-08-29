package brick._breaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Pause {

	int move; //mouse position tracker

	public void update() {
		//checking is mouse cursor inside the button area or not
		if (Brick_Breaker.getShow() == true) {
			if (move > 550 && move < 620 || move > 10 && move < 40) {
				Brick_Breaker.setShow(false);
				move = 0;
				return;
			}
		} else if (Brick_Breaker.getShow() == false) {
			if (move > 550 && move < 620 || move > 10 && move < 40) {
				Brick_Breaker.setShow(true);
				move = 0;
				return;
			}
		}
	}

	public void draw(Graphics2D a) {
		if (Brick_Breaker.getShow() == true) {
			drawPauseButoon(a);
			a.drawString("Pause", 560, 30);

		} else {
			if (Brick_Breaker.getShow() == false) {
				drawPauseButoon(a);
				a.drawString("Play", 568, 30);
			}
		}
	}

	public void mousePressed(int clicked) {
		move = clicked;
	}

	// drawing play/pause button
	private void drawPauseButoon(Graphics2D a) {
		a.setColor(Color.CYAN);
		a.fillRoundRect(550, 10, 70, 30, 10, 10);
		a.setColor(Color.BLACK);
		a.setFont(new Font("Courier New", Font.BOLD, 15));
	}
}
