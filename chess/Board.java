package chess;

public class Board {
  private static Square [][] board = new Square[8][8];

  public static void initialiseBoard() {
    for (int i = 0; i < board[0].length; i++) {
      for (int j=0; j<board[1].length; j++) {
        board[i][j]=new Square();
      }
    }
  }

	public static void initialisePieces(){
		for (int i=0; i<board[0].length; i++){
			for (int j=0; j<board[1].length; j++){
				if (i == 0){
					switch (j){
						case 0:
							Board.setPiece(i,j,new Rook(PieceColour.BLACK));
							break;
						case 1:
							Board.setPiece(i,j,new Knight(PieceColour.BLACK));
							break;
						case 2:
							Board.setPiece(i,j,new Bishop(PieceColour.BLACK));
							break;
						case 3:
							Board.setPiece(i,j,new Queen(PieceColour.BLACK));
							break;
						case 4:
							Board.setPiece(i,j,new King(PieceColour.BLACK));
							break;
						case 5:
							Board.setPiece(i,j,new Bishop(PieceColour.BLACK));
							break;
						case 6:
							Board.setPiece(i,j,new Knight(PieceColour.BLACK));
							break;
						case 7:
							Board.setPiece(i,j,new Rook(PieceColour.BLACK));
							break;
					}
				}else if (i == 1){
					Board.setPiece(i,j,new Pawn(PieceColour.BLACK));
				}else if (i == 6){
					Board.setPiece(i,j,new Pawn(PieceColour.WHITE));
				}else if (i == 7){
					switch (j){
						case 0:
							Board.setPiece(i,j,new Rook(PieceColour.WHITE));
							break;
						case 1:
							Board.setPiece(i,j,new Knight(PieceColour.WHITE));
							break;
						case 2:
							Board.setPiece(i,j,new Bishop(PieceColour.WHITE));
							break;
						case 3:
							Board.setPiece(i,j,new Queen(PieceColour.WHITE));
							break;
						case 4:
							Board.setPiece(i,j,new King(PieceColour.WHITE));
							break;
						case 5:
							Board.setPiece(i,j,new Bishop(PieceColour.WHITE));
							break;
						case 6:
							Board.setPiece(i,j,new Knight(PieceColour.WHITE));
							break;
						case 7:
							Board.setPiece(i,j,new Rook(PieceColour.WHITE));
							break;
					}				
				}else {
					Board.setPiece(i,j, null);
				}
			}
		}
	}

	public static void printBoard(){
		System.out.print("\n  a b c d e f g h \n");
		System.out.print("  -----------------\n");		
		for (int i=0; i<board[0].length; i++){
			int row=i+1;
				for (int j=0; j<board[1].length; j++){
					if ((j==0) && Board.hasPiece(i,j))
						System.out.print(row+" "+Board.getPiece(i,j).getSymbol());	
					else if ((j==0) && !Board.hasPiece(i,j))
						System.out.print(row+"  " );
					else if (Board.hasPiece(i,j))					
						System.out.print("|"+Board.getPiece(i,j).getSymbol());					
					else					
						System.out.print("| ");		
				}				
				System.out.print("  "+row+"\n");
		}
		System.out.print("  -----------------");
		System.out.print("\n  a b c d e f g h \n");	
	}

	public static boolean movePiece(int i0, int j0, int i1, int j1, Piece p){
		Piece movingToPiece;

		movingToPiece = Board.getPiece(i1, j1);
		if ( movingToPiece != null){
			if ((movingToPiece.getSymbol().equals("\u2654")) || (movingToPiece.getSymbol().equals("\u265A"))){
				return true;
			}
			else{
				Board.setPiece(i1,j1,p);
				board[i0][j0].removePiece();
				return false;
			}
		}
		else{
			Board.setPiece(i1,j1,p);
			board[i0][j0].removePiece();
			return false;
		}
	}

  public static void setPiece(int iIn, int jIn, Piece p) {
    board[iIn][jIn].setPiece(p);
  }

  public static Piece getPiece(int iIn, int jIn) {
    return board[iIn][jIn].getPiece();
  }

  public static boolean hasPiece(int i, int j) {
    return board[i][j].hasPiece();
  }
}
