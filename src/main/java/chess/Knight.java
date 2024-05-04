package chess;

public class Knight extends Piece {
  public Knight(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE) {
      this.setSymbol("\u2658");
    } else {
      this.setSymbol("\u265E");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    boolean moveable = false;

    for (int moveAwayX = -2; moveAwayX <= 2; moveAwayX++) {
      if (moveAwayX != 0) {
        if (j1 == j0 + moveAwayX) {

          if (Math.abs(moveAwayX) == 1) {
            for (int moveAwayY = -2; moveAwayY <= 2; moveAwayY += 4) {
              if (i1 == i0 + moveAwayY) {
                moveable = true;
              }
            }
          } else {
            for (int moveAwayY = -1; moveAwayY <= 1; moveAwayY += 2) {
              if (i1 == i0 + moveAwayY) {
                moveable = true;
              }
            }
          }
        }
      }
    }
    if (moveable) {
      if (Board.getPiece(i1, j1) == null || (Board.getPiece(i0, j0).getColour() != Board.getPiece(i1, j1).getColour())) {
        return true;
      }
    }
    return false;
  }
}