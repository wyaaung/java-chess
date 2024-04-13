package chess;

public class Pawn extends Piece {
  public Pawn(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE) {
      this.setSymbol("\u2659");
    } else {
      this.setSymbol("\u265F");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {

    int moveTwo;
    int moveOne;
    int pawnSide;

    if (Board.getPiece(i0, j0).getColour() == PieceColour.WHITE) {
      moveOne = -1;
      moveTwo = -2;
      pawnSide = 6;
    } else {
      moveOne = 1;
      moveTwo = 2;
      pawnSide = 1;
    }

    if (i1 == i0 + moveOne) {

      if ((j1 == j0 - 1) || (j1 == j0 + 1)) {
        if ((Board.getPiece(i1, j1) != null) && (Board.getPiece(i1, j1).getColour() != Board.getPiece(i0, j0).getColour())) {
          return true;
        }
      } else if ((j1 == j0) && (Board.getPiece(i1, j1) == null)) {
        return true;
      }
    } else if ((i1 == i0 + moveTwo) && (j1 == j0) && (Board.getPiece(i1, j1) == null)) {
      if (i0 == pawnSide) {
        return true;
      }
    }

    return false;

  }
}
