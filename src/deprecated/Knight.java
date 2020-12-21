package deprecated;

import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class Knight implements GamePiece
{
	private int x;
	private int y;
	private int width;
	private int height;
	private String color;
	private String pieceName;
	private ImageLoader imageLoader;
	public Knight(String color, String pieceName, int x, int y, int width, int height,ImageLoader imageLoader)
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
		if(color.equalsIgnoreCase(("black")))
			g.drawImage(imageLoader.blackKnight,x,y,width,height,null);
		else
			g.drawImage(imageLoader.whiteKnight,x,y,width,height,null);
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
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
}
