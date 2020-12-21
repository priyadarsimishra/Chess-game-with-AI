package deprecated;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseListener;

public abstract class Piece
{
	public int x;
	public int y;
	public int width;
	public int height;
	public String color; 
	public String pieceName;
	public ImageLoader imageLoader;
	public Piece(String color, String pieceName, int x, int y,int width,int height, ImageLoader imageLoader)
	{
		this.color = color;
		this.pieceName = pieceName;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.imageLoader = imageLoader;
//		addMouseListener(this);
	}
	public abstract void update();
	public abstract void draw(Graphics g);
	public abstract String toString();
	public abstract boolean validMove();
	public abstract int getX();
	public abstract int getY();
	public abstract void setX(int x);
	public abstract void setY(int y);
}
