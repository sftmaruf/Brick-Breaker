package brick._breaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	// variables
	private boolean running, play;
	private BufferedImage image;
	private Graphics2D a;
	private String choice;

//	object
//	private Scanner input;
//	private ball theBall;
//	private paddle thePaddle;
//	private map theMap;

	Ball theBall;
	Paddle thePaddle;
	Map theMap;

	private High_Score theScore;
	private ArrayList<Feature> theFeature;
	private MyMouseMotionListener theMouseListener;
	private MyMouseAdapter theMouseAdapter;
	private MyKeyListener theKeyListener;
	private Pause pause;

	// singleton
	private static GamePanel gamePanel = new GamePanel();

	// constructor
	private GamePanel() {
		initialize();

	}

	public static GamePanel getGamePanel() {
		return gamePanel;
	}

	public void initialize() {
//		input = new Scanner(System.in);
//		theBall = new ball(1, 3);
//		thePaddle = new paddle(70, 12);
//		theMap = new map(4, 8);

		// using factoryMethod design pattern
		theBall = (Ball) ComponentsFactory.getComponents("ball");
		thePaddle = (Paddle) ComponentsFactory.getComponents("paddle");
		theMap = (Map) ComponentsFactory.getComponents("map");

		theScore = new High_Score();
		theFeature = new ArrayList<Feature>();
		pause = new Pause();

		theMouseListener = new MyMouseMotionListener(); // recive mouse position
		theMouseAdapter = new MyMouseAdapter(); // recive mouse pressed
		theKeyListener = new MyKeyListener();

		addMouseMotionListener(theMouseListener);
		addMouseListener(theMouseAdapter);
		addKeyListener(theKeyListener);
		setFocusable(true);

		running = true;
		play = true;

		image = new BufferedImage(Brick_Breaker.Width, Brick_Breaker.Height, BufferedImage.TYPE_INT_RGB);
		a = (Graphics2D) image.getGraphics();
		a.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}

	public void playGames() {

		while (play) {
			pause.draw(a); // render pause more clear
			pause.update(); // after stop the gameLoop the play/pause need to update

			while (Brick_Breaker.getShow()) {
				update();
				draw();
				repaint();

				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void update() { // all component update here
		checkCollision();
		theBall.update();
		thePaddle.update();
		pause.update();
		for (Feature feat : theFeature) {
			feat.update();
		}

	}

	public void draw() { // all component draw here
		a.setColor(Color.WHITE);
		a.fillRect(0, 0, Brick_Breaker.Width, Brick_Breaker.Height);

		theBall.draw(a);
		thePaddle.draw(a);
		theMap.draw(a);
		theScore.draw(a);
		pause.draw(a);

		for (Feature ft : theFeature) {
			ft.draw(a);
		}

		drawWinnerLooser();

	} // end of draw

	private void drawWinnerLooser() {
		if (theMap.win() == true) {
			theMap.drawWinner(a);
			Brick_Breaker.setShow(false); // running = false;
		}

		if (theBall.looser() == true) {

			theBall.drawLooser(a);
			Brick_Breaker.setShow(false); // running = false;
			// restart(false);
		}
		theScore.updateDatabase(Brick_Breaker.getShow()); // running
	} // end of drawWInnerLooser

	public void paintComponent(Graphics a) { // this called by repaint by build in
		Graphics2D graphic2DTool = (Graphics2D) a;
		graphic2DTool.drawImage(image, 0, 0, Brick_Breaker.Width, Brick_Breaker.Height, null);
		graphic2DTool.dispose();
	} // end of paint component

	public void checkCollision() {
		Rectangle ballRect = theBall.getRect();
		Rectangle paddleRect = thePaddle.getRect();

		for (int i = 0; i < theFeature.size(); i++) {
			Rectangle featureBlock = theFeature.get(i).getRect();

			if (paddleRect.intersects(featureBlock)) {
				if (theFeature.get(i).getMod() == Feature.paddleExpandMod && !theFeature.get(i).getmod1CollideDone()) {

					thePaddle.setWidth(thePaddle.getWidth() * 2); // make paddle size double
					thePaddle.setTimer();
					theFeature.get(i).setMod1CollideDone(true);
				}

				if (theFeature.get(i).getMod() == Feature.ballFastMod && !theFeature.get(i).getmod2CollideDone()) {
					theBall.setdirectXY((theBall.getX() * 2), (theBall.getY() * 2)); // make ball fast
					theBall.setTimer();
					theFeature.get(i).setMod2CollideDone(true);
				}

			}
		} // end of for loop

		if (ballRect.intersects(paddleRect)) {
			theBall.setDirectY(-theBall.getDirectY());
		}

		A: for (int i = 0; i < theMap.getMap().length; i++) { // i=row,j=column
			for (int j = 0; j < theMap.getMap()[0].length; j++) {

				if (theMap.getMap()[i][j] > 0) {
					int brickX = j * theMap.getbrickWidth() + theMap.hor_Padding;
					int brickY = i * theMap.getbrickHeight() + theMap.ver_Padding;
					int brickWidth = theMap.getbrickWidth();
					int brickHeight = theMap.getbrickHeight();

					Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);

					if (ballRect.intersects(brickRect)) {
						// theMap.setBrick(i, j, 0);
						if (theMap.getMap()[i][j] > 3) {
							theFeature.add(new Feature(brickX, brickY, theMap.getMap()[i][j], brickWidth, brickHeight));
							theMap.setBrick(i, j, 3);
						} else {
							theMap.hitMap(i, j);
						}
						theBall.setDirectY(-theBall.getDirectY());
						theScore.addScore(10);

						break A;
					}
				}

			}
		} // end of for loop // end of for loop
	} // end of CheckCollision

	private class MyMouseMotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent me) {

		}

		@Override
		public void mouseMoved(MouseEvent me) {
			thePaddle.mouseMoved(me.getX());
		}

	}

	private class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent me) {
			pause.mousePressed(me.getX());
		}
	}

	private class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent ke) {
		}

		@Override
		public void keyPressed(KeyEvent ke) {

			if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
				thePaddle.keyPressed(ke.getKeyCode());
			} else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
				thePaddle.keyPressed(ke.getKeyCode());
			}

			if (Brick_Breaker.getShow() == false) {

				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

					theBall = (Ball) ComponentsFactory.getComponents("ball");
					thePaddle = (Paddle) ComponentsFactory.getComponents("paddle");
					theMap = (Map) ComponentsFactory.getComponents("map");
					draw();
					Brick_Breaker.setShow(true);

				} else if (ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
					exit(0);
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent ke) {
		}
	}

}
