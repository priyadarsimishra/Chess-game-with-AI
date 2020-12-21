package deprecated;

public class PieceInitializer 
{
	private King whiteKing;
	private King blackKing;
	private Queen whiteQueen;
	private Queen blackQueen;
	private Knight whiteKnight1;
	private Knight blackKnight1;
	private Knight whiteKnight2;
	private Knight blackKnight2;
	private Bishop whiteBishop1;
	private Bishop blackBishop1;
	private Bishop whiteBishop2;
	private Bishop blackBishop2;
	private Rook whiteRook1;
	private Rook blackRook1;
	private Rook whiteRook2;
	private Rook blackRook2;
	private Pawn whitePawn1;
	private Pawn whitePawn2;
	private Pawn whitePawn3;
	private Pawn whitePawn4;
	private Pawn whitePawn5;
	private Pawn whitePawn6;
	private Pawn whitePawn7;
	private Pawn whitePawn8;
	private Pawn blackPawn1;
	private Pawn blackPawn2;
	private Pawn blackPawn3;
	private Pawn blackPawn4;
	private Pawn blackPawn5;
	private Pawn blackPawn6;
	private Pawn blackPawn7;
	private Pawn blackPawn8;
	private boolean done = false;
	public PieceInitializer(PieceHandler pieceHandler, int SQUARE_LENGTH, ImageLoader imageLoader, Square[][] squares)
	{
		/** 
		 * INITIALIZES WHITE PIECES
		 * */
		whiteKing = new King("white","King",5*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteQueen = new Queen("white","Queen",4*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteRook1 = new Rook("white","Rook",1*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteRook2 = new Rook("white","Rook",8*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn1 = new Pawn("white","Pawn",1*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn2 = new Pawn("white","Pawn",2*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn3 = new Pawn("white","Pawn",3*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn4 = new Pawn("white","Pawn",4*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn5 = new Pawn("white","Pawn",5*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn6 = new Pawn("white","Pawn",6*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn7 = new Pawn("white","Pawn",7*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whitePawn8 = new Pawn("white","Pawn",8*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 7*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteKnight1 = new Knight("white","Knight",2*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteKnight2 = new Knight("white","Knight",7*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteBishop1 = new Bishop("white","Bishop",3*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		whiteBishop2 = new Bishop("white","Bishop",6*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 8*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		/** 
		 * INITIALIZES BLACK PIECES
		 * */	
		blackKing = new King("black","King",5*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackQueen = new Queen("black","Queen",4*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackRook1 = new Rook("black","Rook",1*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackRook2 = new Rook("black","Rook",8*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn1 = new Pawn("black","Pawn",1*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn2 = new Pawn("black","Pawn",2*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn3 = new Pawn("black","Pawn",3*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn4 = new Pawn("black","Pawn",4*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn5 = new Pawn("black","Pawn",5*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn6 = new Pawn("black","Pawn",6*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn7 = new Pawn("black","Pawn",7*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackPawn8 = new Pawn("black","Pawn",8*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 2*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackKnight1 = new Knight("black","Knight",2*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackKnight2 = new Knight("black","Knight",7*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackBishop1 = new Bishop("black","Bishop",3*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		blackBishop2 = new Bishop("black","Bishop",6*SQUARE_LENGTH-(SQUARE_LENGTH/2)+10, 1*SQUARE_LENGTH-(SQUARE_LENGTH/2)-10,100,100,imageLoader);
		/** 
		 * ADDS WHITE PIECES TO LINKEDLIST
		 * */	
		pieceHandler.addPiece(whiteKing);
		pieceHandler.addPiece(whiteQueen);
		pieceHandler.addPiece(whiteRook1);
		pieceHandler.addPiece(whiteRook2);
		pieceHandler.addPiece(whitePawn1);
		pieceHandler.addPiece(whitePawn2);
		pieceHandler.addPiece(whitePawn3);
		pieceHandler.addPiece(whitePawn4);
		pieceHandler.addPiece(whitePawn5);
		pieceHandler.addPiece(whitePawn6);
		pieceHandler.addPiece(whitePawn7);
		pieceHandler.addPiece(whitePawn8);
		pieceHandler.addPiece(whiteKnight1);
		pieceHandler.addPiece(whiteKnight2);
		pieceHandler.addPiece(whiteBishop1);
		pieceHandler.addPiece(whiteBishop2);
		/** 
		 * ADDS BLACK PIECES TO LINKEDLIST
		 * */		
		pieceHandler.addPiece(blackKing);
		pieceHandler.addPiece(blackQueen);
		pieceHandler.addPiece(blackRook1);
		pieceHandler.addPiece(blackRook2);
		pieceHandler.addPiece(blackPawn1);
		pieceHandler.addPiece(blackPawn2);
		pieceHandler.addPiece(blackPawn3);
		pieceHandler.addPiece(blackPawn4);
		pieceHandler.addPiece(blackPawn5);
		pieceHandler.addPiece(blackPawn6);
		pieceHandler.addPiece(blackPawn7);
		pieceHandler.addPiece(blackPawn8);
		pieceHandler.addPiece(blackKnight1);
		pieceHandler.addPiece(blackKnight2);
		pieceHandler.addPiece(blackBishop1);
		pieceHandler.addPiece(blackBishop2);
		/**
		 * PUT WHITE PIECES ON SQUARES
		 * */
		squares[7][7].setPieceOnSquare(whiteRook1);
		squares[6][7].setPieceOnSquare(whiteKnight1);
		squares[5][7].setPieceOnSquare(whiteBishop1);
		squares[4][7].setPieceOnSquare(whiteKing);
		squares[3][7].setPieceOnSquare(whiteQueen);
		squares[2][7].setPieceOnSquare(whiteBishop2);
		squares[1][7].setPieceOnSquare(whiteKnight2);
		squares[0][7].setPieceOnSquare(whiteRook2);
		squares[7][6].setPieceOnSquare(whitePawn8);
		squares[6][6].setPieceOnSquare(whitePawn7);
		squares[5][6].setPieceOnSquare(whitePawn6);
		squares[4][6].setPieceOnSquare(whitePawn5);
		squares[3][6].setPieceOnSquare(whitePawn4);
		squares[2][6].setPieceOnSquare(whitePawn3);
		squares[1][6].setPieceOnSquare(whitePawn2);
		squares[0][6].setPieceOnSquare(whitePawn1);
		/**
		 * PUT BLACK PIECES ON SQUARES
		 * */
		squares[7][0].setPieceOnSquare(blackRook1);
		squares[6][0].setPieceOnSquare(blackKnight1);
		squares[5][0].setPieceOnSquare(blackBishop1);
		squares[4][0].setPieceOnSquare(blackKing);
		squares[3][0].setPieceOnSquare(blackQueen);
		squares[2][0].setPieceOnSquare(blackBishop2);
		squares[1][0].setPieceOnSquare(blackKnight2);
		squares[0][0].setPieceOnSquare(blackRook2);
		squares[7][1].setPieceOnSquare(blackPawn8);
		squares[6][1].setPieceOnSquare(blackPawn7);
		squares[5][1].setPieceOnSquare(blackPawn6);
		squares[4][1].setPieceOnSquare(blackPawn5);
		squares[3][1].setPieceOnSquare(blackPawn4);
		squares[2][1].setPieceOnSquare(blackPawn3);
		squares[1][1].setPieceOnSquare(blackPawn2);
		squares[0][1].setPieceOnSquare(blackPawn1);
	}
	public void setPos(Piece piece, int mx, int my)
	{
		piece.setX(mx);
		piece.setY(my);		
	}

}
