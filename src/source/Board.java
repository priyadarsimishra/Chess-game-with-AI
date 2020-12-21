package source;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Board implements Component
{
	private Square[][] board;
	private String[] letters;
	private Integer[] numbers;
	private Color lightSquareColor;
	private Color darkSquareColor;
	private boolean boardSetUpComplete;
	public static final int ROWS = 8;
	public static final int COLUMNS = 8;
	public static final int SQUARE_LENGTH = 108;
	
	public Board(Color lightSquareColor, Color darkSquareColor) 
	{
		board = new Square[][]
		{
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()},
			{new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square(),new Square()}
		};
		letters = new String[] {"A","B","C","D","E","F","G","H"};
		numbers = new Integer[] {1,2,3,4,5,6,7,8};
		this.lightSquareColor = lightSquareColor;
		this.darkSquareColor = darkSquareColor;
		boardSetUpComplete = false;
	}
	/**
	 * 
	 */
	public void update()
	{
		
	}
	/**
	 * This method is responsible for drawing the board, 
	 * it calls other methods that draw other parts of the UI
	 * but it is the main method for the drawing of the board.
	 * It also sets up the board before, so we can draw the board
	 * properly. 
	 * 
	 * @param g graphics instance
	 */
	public void draw(Graphics g)
	{
		if(!boardSetUpComplete)
			setUpBoard();
		drawBoard(g);
		drawNotationAroundBoard(g);
	}
	
	/***
	 * This method iterates through the 2D square array and
	 * calls each Square's draw method, which draws our
	 * chess board for us.
	 * 
	 * @param g graphics instance
	 */
	public void drawBoard(Graphics g)
	{
		for(int i = 0;i<ROWS;i++)
		{
			for(int j =0;j<COLUMNS;j++)
			{
				board[i][j].draw(g);
			}
		}
	}
	/**
	 * Draws the letters and numbers around the chess board
	 * which is used for chess notation, such as "Bb4", meaning
	 * Bishop to square denoted by "b4". 
	 * 
	 * @param g graphics instance
	 */
	public void drawNotationAroundBoard(Graphics g)
	{
		g.setFont(new Font("Helevetica", Font.BOLD, 24));
		g.setColor(Color.WHITE);
		int index = 0;
		for(int y = 98;y<=900;y+=108)
		{
			g.drawString(numbers[index++]+"", 30, y);
 		}
		index = 0;
		for(int x = 105; x<=900;x+=108)
		{
			g.drawString(letters[index++], x, 918);
		}
	}
	
	/**
	 * This method sets up the board, first time the board is created
	 * It assigns each square, its x,y position and the color.
	 */
	public void setUpBoard() 
	{
		for(int i = 0;i<ROWS;i++)
		{
			for(int j = 0;j<COLUMNS;j++)
			{
				if(board[i][j].getX() == -1)
				{
					if((i+1)%2 == 1)
					{
						if((j+1)%2 == 1)
						{
							board[i][j].setX(i*SQUARE_LENGTH+60);
							board[i][j].setY(j*SQUARE_LENGTH+32);
							board[i][j].setSquareColor(lightSquareColor);
						}
						else
						{
							board[i][j].setX(i*SQUARE_LENGTH+60);
							board[i][j].setY(j*SQUARE_LENGTH+32);
							board[i][j].setSquareColor(darkSquareColor);
						}	
					}
					else
					{
						if((j+1)%2 == 1)
						{
							board[i][j].setX(i*SQUARE_LENGTH+60);
							board[i][j].setY(j*SQUARE_LENGTH+32);
							board[i][j].setSquareColor(darkSquareColor);
						}
						else
						{
							board[i][j].setX(i*SQUARE_LENGTH+60);
							board[i][j].setY(j*SQUARE_LENGTH+32);
							board[i][j].setSquareColor(lightSquareColor);
						}
					}
				}
			}
		}
		boardSetUpComplete = true;
	}
	
	/***
	 * Setter method to set new color for light squares on board
	 * 
	 * @param lightSquareColor new color for light squares on board
	 */
	public void setLightSquareColor(Color lightSquareColor)
	{
		this.lightSquareColor = lightSquareColor;
	}
	
	/***
	 * Setter method to set new color for dark squares on board
	 * 
	 * @param darkSquareColor new color for dark squares on board
	 */
	public void setDarkSquareColor(Color darkSquareColor)
	{
		this.darkSquareColor = darkSquareColor;
	}
}
