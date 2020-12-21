package deprecated;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	public static final int HEIGHT = 960;
	public static final int WIDTH = 1400;
	public static final String TITLE = "Chess";
	public Frame(Game game)
	{
		frame = new JFrame(TITLE);
		frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}	
}
