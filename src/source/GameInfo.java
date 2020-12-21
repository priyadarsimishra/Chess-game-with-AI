package source;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GameInfo implements Component
{
	private GameTimer timer1;
	private GameTimer timer2;

	public GameInfo()
	{
		timer1 = new GameTimer(3,20,20, "top");
		timer2 = new GameTimer(1,0,5, "bottom");
	}
	
	public void update() 
	{
		timer1.update();
		timer2.update();
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		timer1.draw(g);
		timer2.draw(g);
		drawTimeBoxes(g, "Guest","1900","top");
		drawTimeBoxes(g, "Guest","2100","bottom");
		drawNotation(g);
	}
	/**
	 * This method draws the time boxes for the two players playing and
	 * it displays player name, rating and it has a string to signify the location
	 * of the time box depending what color the player is playing.
	 * 
	 * @param g Graphics instance
	 * @param player player's name 
	 * @param rating player's rating
	 * @param location location of the time box(top or bottom)
	 */
	public void drawTimeBoxes(Graphics g, String player, String rating,String location)
	{
        ((Graphics2D)g).setStroke(new BasicStroke(3));
		g.setFont(new Font("Arial",Font.BOLD, 24));
		g.setColor(Color.WHITE);
		if(location.equals("top"))
		{
			int width = g.getFontMetrics().stringWidth(player);
			g.drawRect(965, 60, 400, 100);
			g.drawString(player, 965, 50);
			g.drawString("("+rating+")", 965+width+5, 50);
		}
		else if(location.equals("bottom"))
		{
			int width = g.getFontMetrics().stringWidth(player);
			g.drawRect(965, Frame.HEIGHT-160,400, 100);
			g.drawString(player, 965, Frame.HEIGHT-170);
			g.drawString("("+rating+")", 965+width+5, Frame.HEIGHT-170);
		}
	}
	/**
	 * Draws the game notation for players to see while playing
	 * and it allows player to see the notation(just like Chess)
	 * of the game which they can later analysis.
	 * @param g
	 */
	public void drawNotation(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(965, 175,400, 575);
		
		g.setColor(Color.BLACK);
		g.drawLine(965, 215,1365, 215);
		g.drawLine((965+400/2),175,(965+400/2),215);
		
		g.drawString("WHITE", 1020, 205);
		g.drawString("BLACK", 1230, 205);
		
		drawMoveNotation(g,965,216,"Bg5","white");
		drawMoveNotation(g,1165,216,"Ke5","black");
		drawMoveNotation(g,965,246,"Nf5","white");
		drawMoveNotation(g,1165,246,"Qb5","black");
	}
	/**
	 * This method draws a notation component on the notation
	 * sheet and this notation is a parameter which is a string.
	 * @param g Graphics instance
	 * @param notation string that represents the notation(ex: Bg5)
	 */
	public void drawMoveNotation(Graphics g, int x, int y, String notation, String color)
	{
		if(color.equalsIgnoreCase("white"))
		{
			g.setColor(new Color(229, 232, 232));
			g.fillRect(x, y, 200, 30);
			g.setColor(Color.BLACK);
			g.drawString(notation, x+75, y+22);
		}
		else if(color.equalsIgnoreCase("black"))
		{
			g.setColor(new Color(133, 146, 158));
			g.fillRect(x, y, 200, 30);
			g.setColor(Color.WHITE);
			g.drawString(notation, x+75, y+22);
		}
		g.setColor(Color.BLACK);
		g.drawLine(x,y+30,x+200,y+30);
	}
}
