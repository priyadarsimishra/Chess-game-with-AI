package deprecated;

import java.awt.Graphics;
import java.util.LinkedList;

public class PieceHandler
{
	public LinkedList<GamePiece> pieces;
	public PieceHandler()
	{
		pieces = new LinkedList<GamePiece>();
	}
	public void update()
	{
		for(int i = 0;i<pieces.size();i++)
		{
			GamePiece piece = pieces.get(i);
			piece.update();
		}
	}
	public void draw(Graphics g)
	{
		for(int i = 0;i<pieces.size();i++)
		{
			GamePiece piece = pieces.get(i);
			piece.draw(g);
		}
	}
	public void addPiece(GamePiece piece)
	{
		this.pieces.add(piece);
	}
	public void removePiece(GamePiece piece)
	{
		this.pieces.remove(piece);
	}
}
