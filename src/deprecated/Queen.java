package deprecated;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Queen implements GamePiece
{
	private int x;
	private int y;
	private int width;
	private int height;
	private String color;
	private String pieceName;
	private ImageLoader imageLoader;
	public Queen(String color, String pieceName, int x, int y, int width, int height, ImageLoader imageLoader)
	{
//		super(color,pieceName,x,y,width,height,imageLoader);
		this.color = color;
		this.pieceName = pieceName;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.imageLoader = imageLoader;
	}
	public void update() 
	{
		
	}
	public void draw(Graphics g) 
	{
		if(color.equalsIgnoreCase("black")) 
			g.drawImage(imageLoader.blackQueen, x,y, width, height, null);
		else
			g.drawImage(imageLoader.whiteQueen, x,y, width, height, null);
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(color);
		sb.append(" ");
		sb.append(pieceName);
		return sb.toString();
	}
	public boolean validMove() 
	{
		return false;
	}
	public int getX() 
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	public void mouseClicked(MouseEvent e)
	{
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	public void mouseEntered(MouseEvent e) 
	{
		
	}
	public void mouseExited(MouseEvent e) 
	{
		
	}
}
