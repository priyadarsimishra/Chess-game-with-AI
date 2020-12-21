package deprecated;

import java.awt.Color;
import java.awt.Graphics;

public class Square
{
	private int x; 
	private int y;
	private int row;
	private int col;
	private Color squareColor;
	private int width;
	private int height;
	private GamePiece pieceOnSquare;
	public Square() {}
	public Square(int x, int y, Color squareColor, int row, int col, int width, int height, GamePiece pieceOnSquare)
	{
		this.x = x;
		this.y = y;
		this.row = row;
		this.col = col;
		this.width = width;
		this.height = height;
		this.squareColor = squareColor;
		this.pieceOnSquare = pieceOnSquare;
	}
	public void update()
	{
		
	}
	public void draw(Graphics g)
	{
		g.setColor(squareColor);
		g.fillRect(x, y, width, height);
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
	public int getRow() 
	{
		return row;
	}
	public void setRow(int row) 
	{
		this.row = row;
	}
	public int getCol() 
	{
		return col;
	}
	public void setCol(int col) 
	{
		this.col = col;
	}
	public Color getSquareColor() 
	{
		return squareColor;
	}
	public void setSquareColor(Color squareColor) 
	{
		this.squareColor = squareColor;
	}
	public GamePiece getPieceOnSquare() 
	{
		return pieceOnSquare;
	}
	public void setPieceOnSquare(GamePiece pieceOnSquare) 
	{
		this.pieceOnSquare = pieceOnSquare;
	}
}
