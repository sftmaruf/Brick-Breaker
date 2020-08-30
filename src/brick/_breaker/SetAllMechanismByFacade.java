package brick._breaker;

import javax.swing.JFrame;

public class SetAllMechanismByFacade {

	//facade design pattern
	public static void mechanism() {
		JFrame theFrame = new JFrame("Brick Breaker");
//       GamePanel thePanel = new GamePanel();
		GamePanel thePanel = GamePanel.getGamePanel();

		theFrame.setLocation(500, 200);
		theFrame.setResizable(false);
		theFrame.setSize(Brick_Breaker.Width, Brick_Breaker.Height);
		theFrame.add(thePanel);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setVisible(true);

		thePanel.playGames();
	}
}
