package chess;

public class Bishop extends Piece {
  public Bishop(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE) {
      this.setSymbol("\u2657");
    } else {
      this.setSymbol("\u265D");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    int movingDistanceX = Math.abs(j1 - j0);
    int movingDistanceY = Math.abs(i1 - i0);

    if (movingDistanceX != movingDistanceY) {
      return false;
    }

    String direction;

    if (j1 > j0) {
      if (i1 < i0) {
        direction = "topRight";
      } else if (i1 > i0) {
        direction = "bottomRight";
      } else {
        return false;
      }
    } else if (j1 < j0) {
      if (i1 < i0) {
        direction = "topLeft";
      } else if (i1 > i0) {
        direction = "bottomLeft";
      } else {
        return false;
      }
    } else {
      return false;
    }

    Piece testPiece, movingFromPiece;

    movingFromPiece = Board.getPiece(i0, j0);

    for (int diagonal = 1; diagonal <= movingDistanceX; diagonal++) {
      if (direction.equals("topRight")) {
        testPiece = Board.getPiece(i0 - diagonal, j0 + diagonal);
      } else if (direction.equals("bottomRight")) {
        testPiece = Board.getPiece(i0 + diagonal, j0 + diagonal);
      } else if (direction.equals("topLeft")) {
        testPiece = Board.getPiece(i0 - diagonal, j0 - diagonal);
      } else {
        testPiece = Board.getPiece(i0 + diagonal, j0 - diagonal);
      }

      if ((testPiece != null) && (diagonal != movingDistanceX)) {
        return false;
      } else if ((diagonal == movingDistanceX) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))) {
        return true;
      }
    }
    return false;
  }
}
