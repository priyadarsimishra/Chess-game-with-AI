package deprecated;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Board implements MouseListener, MouseMotionListener
{
	public static final int SQUARE_LENGTH = 108;
	private ImageLoader imageLoader;
	private Square[][] board;
	private String[] columnAlphabets;
	private String[] rowNumbers;
	public PieceHandler pieceHandler;
	private PieceInitializer pieceInitializer; 
	private int diffX;
	private int diffY;
	private boolean dragging;
	private GamePiece temp;
	private boolean placePiecesAtStart;
	/**
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * [] [] [] [] [] [] [] []
	 * */
	public Board(ImageLoader imageLoader)
	{
		this.imageLoader = imageLoader;
		board = new Square[8][8];
		columnAlphabets = new String[]{"A","B","C","D","E","F","G","H"};
		rowNumbers = new String[]{"8","7","6","5","4","3","2","1"};
		pieceHandler = new PieceHandler();
		diffX = 0;
		diffY = 0;
		dragging = false;
	}
	public void update()
	{
		pieceHandler.update();
	}
	public void draw(Graphics g)
	{
		drawBoard(g);
		placePieces(g);
	}
	public void placePieces(Graphics g)
	{
		for(int i = 0;i<pieceHandler.pieces.size();i++)
		{
			if(pieceHandler.pieces.get(i) != null) pieceHandler.pieces.get(i).draw(g);
		}
	}
	public void drawBoard(Graphics g)
	{
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[i].length;j++)
			{
				if((i+1)%2 == 1)
				{
					if((j+1)%2 == 1)
						board[i][j] = new Square(i*SQUARE_LENGTH+60, j*SQUARE_LENGTH+38,new Color(255, 227, 209),i+1,j+1,SQUARE_LENGTH,SQUARE_LENGTH,null);
					else 
						board[i][j] = new Square(i*SQUARE_LENGTH+60, j*SQUARE_LENGTH+38,new Color(209, 142, 98),i+1,j+1,SQUARE_LENGTH,SQUARE_LENGTH,null);
				}
				else
				{
					if((j+1)%2 == 1)
						board[i][j] = new Square(i*SQUARE_LENGTH+60, j*SQUARE_LENGTH+38,new Color(209, 142, 98),i+1,j+1,SQUARE_LENGTH,SQUARE_LENGTH,null);
					else
						board[i][j] = new Square(i*SQUARE_LENGTH+60, j*SQUARE_LENGTH+38,new Color(255, 227, 209),i+1,j+1,SQUARE_LENGTH,SQUARE_LENGTH,null);
				}
			}
		}
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[i].length;j++)
			{
				board[i][j].draw(g);
				
			}
		}
		if(!placePiecesAtStart)
		{
			pieceInitializer = new PieceInitializer(pieceHandler, SQUARE_LENGTH, imageLoader, board);
			placePiecesAtStart = true;
		}
		drawLettersAndNumbers(g);
	}
	public void drawLettersAndNumbers(Graphics g)
	{
		boardTester();
		int index = 0;
		g.setColor(Color.WHITE);
		((Graphics2D)g).setStroke(new BasicStroke(4));
		g.drawRect(58, 36, SQUARE_LENGTH*8+3, SQUARE_LENGTH*8+3);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Helevetica", Font.BOLD, 24));
		for(int y = 103;y<=900;y+=108)
		{
			if(index < 8) g.drawString(rowNumbers[index++], 30, y);
 		}
		index = 0;
		for(int x = 105; x<=900;x+=108)
		{
			if(index < 8) g.drawString(columnAlphabets[index++], x, 930);
		}
	}
	public void mouseDragged(MouseEvent e) 
	{
		
	}
	public void mousePressed(MouseEvent e) 
	{
		int mx = e.getX();
		int my = e.getY();
		if(board[getRowOfSquare(mx,my)-1][getColumnOfSquare(mx,my)-1].getPieceOnSquare() != null)
		{
			temp = board[getRowOfSquare(mx,my)-1][getColumnOfSquare(mx,my)-1].getPieceOnSquare();
			
		}
	}
	private void boardTester()
	{
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[i].length;j++)
			{
				System.out.print(board[i][j].getPieceOnSquare()+" ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
	public void mouseReleased(MouseEvent e) 
	{
		int mx = e.getX();
		int my = e.getY();
		int row = getRowOfSquare(mx,my);
		int col = getColumnOfSquare(mx,my);
		if(clickOnBoard(mx,my) && dragging && temp != null)
		{
			temp.setX(row*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10);
			temp.setY(col*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10);
			board[row-1][col-1].setPieceOnSquare(temp);
			dragging = false;
		}
	}
	public void mouseMoved(MouseEvent e) 
	{
		
	}
	public void mouseClicked(MouseEvent e) 
	{
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public boolean clickOnBoard(int mx, int my) 
	{
		if(mx >= 55 && mx <= 925)
		{
			if(my >= 36 && my <= 909)
			{
				return true;
			}
		}
		return false;
	}
	public boolean clickedOnAPiece(int mx, int my)
	{
		if(clickOnBoard(mx,my))
		{
			int row = getRowOfSquare(mx,my);
			int col = getColumnOfSquare(mx,my);
			if(row != -1 && col != -1 && board[row-1][col-1].getPieceOnSquare() != null)
			{
				return true;
			}
		}
		return false;
	}
	public int getRowOfSquare(int mx, int my)
	{
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[i].length;j++)
			{
				if(mx >= board[i][j].getX() && mx <= board[i][j].getX()+SQUARE_LENGTH)
				{
					return board[i][j].getRow();
				}
			}
		}
		return -1;
	}
	public int getColumnOfSquare(int mx, int my)
	{
		for(int i = 0;i<board.length;i++)
		{
			for(int j = 0;j<board[i].length;j++)
			{
				if(my >= board[i][j].getY() && my <= board[i][j].getY()+SQUARE_LENGTH)
				{
					return board[i][j].getCol();
				}
			}
		}
		return -1;
	}
}
