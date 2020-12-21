package deprecated;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageLoader 
{
	public Image whiteKing;
	public Image whiteQueen;
	public Image whiteKnight;
	public Image whiteBishop;
	public Image whiteRook;
	public Image whitePawn;
	public Image blackKing;
	public Image blackQueen;
	public Image blackKnight;
	public Image blackBishop;
	public Image blackRook;
	public Image blackPawn;
	public ImageIcon whiteKingIcon;
	public ImageIcon whiteQueenIcon;
	public ImageIcon whiteKnightIcon;
	public ImageIcon whiteBishopIcon;
	public ImageIcon whiteRookIcon;
	public ImageIcon whitePawnIcon;
	public ImageIcon blackKingIcon;
	public ImageIcon blackQueenIcon;
	public ImageIcon blackKnightIcon;
	public ImageIcon blackBishopIcon;
	public ImageIcon blackRookIcon;
	public ImageIcon blackPawnIcon;
	public ImageLoader()
	{
		whiteKing = null;
		whiteQueen = null;
		whiteKnight = null;
		whiteBishop= null;
		whiteRook = null;
		whitePawn = null;
		blackKing = null;
		blackQueen = null;
		blackKnight = null;
		blackBishop = null;
		blackRook = null;
		blackPawn = null;
		whiteKingIcon = null;
		whiteQueenIcon = null;
		whiteKnightIcon = null;
		whiteBishopIcon = null;
		whiteRookIcon = null;
		whitePawnIcon = null;
		blackKingIcon = null;
		blackQueenIcon = null;
		blackKnightIcon = null;
		blackBishopIcon = null;
		blackRookIcon = null;
		blackPawnIcon = null;
	}
	public void loadImages()
	{
		//white King
		whiteKingIcon = new ImageIcon(this.getClass().getResource("/resources/whiteKing.png"));
		whiteKing = whiteKingIcon.getImage();
		//white Queen
		whiteQueenIcon = new ImageIcon(this.getClass().getResource("/resources/whiteQueen.png"));
		whiteQueen = whiteQueenIcon.getImage();
		//white Knight
		whiteKnightIcon = new ImageIcon(this.getClass().getResource("/resources/whiteKnight.png"));
		whiteKnight = whiteKnightIcon.getImage();
		//white Bishop
		whiteBishopIcon = new ImageIcon(this.getClass().getResource("/resources/whiteBishop.png"));
		whiteBishop = whiteBishopIcon.getImage();
		//white Rook
		whiteRookIcon = new ImageIcon(this.getClass().getResource("/resources/whiteRook.png"));
		whiteRook = whiteRookIcon.getImage();
		//white Pawn
		whitePawnIcon = new ImageIcon(this.getClass().getResource("/resources/whitePawn.png"));
		whitePawn = whitePawnIcon.getImage();
		//black King
		blackKingIcon = new ImageIcon(this.getClass().getResource("/resources/blackKing.png"));
		blackKing = blackKingIcon.getImage();
		//black Queen
		blackQueenIcon = new ImageIcon(this.getClass().getResource("/resources/blackQueen.png"));
		blackQueen = blackQueenIcon.getImage();
		//black Knight
		blackKnightIcon = new ImageIcon(this.getClass().getResource("/resources/blackKnight.png"));
		blackKnight = blackKnightIcon.getImage();
		//black Bishop
		blackBishopIcon = new ImageIcon(this.getClass().getResource("/resources/blackBishop.png"));
		blackBishop = blackBishopIcon.getImage();
		//black Rook
		blackRookIcon = new ImageIcon(this.getClass().getResource("/resources/blackRook.png"));
		blackRook = blackRookIcon.getImage();
		//black Pawn
		blackPawnIcon = new ImageIcon(this.getClass().getResource("/resources/blackPawn.png"));
		blackPawn = blackPawnIcon.getImage();
	}
}
