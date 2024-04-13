package chess;

public class King extends Piece {
  public King(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE) {
      this.setSymbol("\u2654");
    } else {
      this.setSymbol("\u265A");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    for (int moveAwayX = -1; moveAwayX <= 1; moveAwayX++) {
      for (int moveAwayY = -1; moveAwayY <= 1; moveAwayY++) {
        if (i1 == i0 + moveAwayX || j1 == j0 + moveAwayY) {
          if ((Board.getPiece(i1, j1) != null) && (Board.getPiece(i0, j0).getColour() != Board.getPiece(i1, j1).getColour())) {
            return true;
          } else if (Board.getPiece(i1, j1) == null) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
