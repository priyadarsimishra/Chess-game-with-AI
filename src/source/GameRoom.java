package source;

import java.awt.Color;
import java.awt.Graphics;

public class GameRoom implements Component
{
	private Board gameBoard;
	private GameInfo gameInfo;

	public GameRoom()
	{
		gameBoard = new Board(new Color(209, 142, 98),new Color(255, 227, 209));
		gameInfo = new GameInfo();
	}
	
	public void update()
	{
		gameInfo.update();
	}
	
	public void draw(Graphics g)
	{
		g.setColor(new Color(66, 66, 66));
		g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);
		gameBoard.draw(g);
		gameInfo.draw(g);
	}
}
