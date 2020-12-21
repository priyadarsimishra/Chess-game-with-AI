package deprecated;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessPiece extends Component implements MouseListener
{
	private int x;
	private int y;
	private int width;
	private int height;
	private String color;
	private String pieceName;
	private ImageLoader imageLoader;
	boolean clicked = false;
	public ChessPiece(String color, String pieceName, int x, int y, int width, int height, ImageLoader imageLoader)
	{
//		super(color,pieceName,x,y,width, height, imageLoader);
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
		{
			if(pieceName.equalsIgnoreCase(("King"))) g.drawImage(imageLoader.blackKing,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Queen"))) g.drawImage(imageLoader.blackQueen,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Bishop"))) g.drawImage(imageLoader.blackBishop,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Knight"))) g.drawImage(imageLoader.blackKnight,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Rook"))) g.drawImage(imageLoader.blackRook,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Pawn"))) g.drawImage(imageLoader.blackPawn,x,y,width,height,null);
		}
		else
		{
			if(pieceName.equalsIgnoreCase(("King"))) g.drawImage(imageLoader.whiteKing,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Queen"))) g.drawImage(imageLoader.whiteQueen,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Bishop"))) g.drawImage(imageLoader.whiteBishop,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Knight"))) g.drawImage(imageLoader.whiteKnight,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Rook"))) g.drawImage(imageLoader.whiteRook,x,y,width,height,null);
			else if(pieceName.equalsIgnoreCase(("Pawn"))) g.drawImage(imageLoader.whitePawn,x,y,width,height,null);
		}
		if(clicked) {
			g.setColor(Color.RED);
			g.fillRect(x, y, width, height);
		}
			
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
	public void mouseClicked(MouseEvent e) 
	{
		
	}
	public void mousePressed(MouseEvent e) 
	{
		clicked = !clicked;
	}
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	public void mouseEntered(MouseEvent e) 
	{
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
}
