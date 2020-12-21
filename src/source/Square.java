package source;

import java.awt.Color;
import java.awt.Graphics;

public class Square implements Component
{
	private int x,y;
	private Piece piece;
	private Color squareColor;
	
	public Square() 
	{
		x = -1;
		y = -1;
		piece = null;
		squareColor = null;
	}
	
	public Square(int x, int y, Piece piece, Color squareColor)
	{
		this.x = x;
		this.y = y;
		this.piece = piece;
		this.squareColor = squareColor;
	}

	public void update()
	{
		
	}
	
	public void draw(Graphics g)
	{
		g.setColor(squareColor);
		g.fillRect(x,y,Board.SQUARE_LENGTH,Board.SQUARE_LENGTH);
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

	public Piece getPiece() 
	{
		return piece;
	}

	public void setPiece(Piece piece) 
	{
		this.piece = piece;
	}

	public Color getSquareColor() 
	{
		return squareColor;
	}

	public void setSquareColor(Color squareColor) 
	{
		this.squareColor = squareColor;
	}

	
}
