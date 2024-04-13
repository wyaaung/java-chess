package chess;

public class Queen extends Piece {
  public Queen(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE) {
      this.setSymbol("\u2655");
    } else {
      this.setSymbol("\u265B");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    String direction, type;

    if (i1 == i0) { //setting all possible move directions
      if (j1 > j0) {
        direction = "right";
        type = "straight";
      } else {
        direction = "left";
        type = "straight";
      }
    } else if (j1 == j0) {
      if (i1 > i0) {
        direction = "bottom";
        type = "straight";
      } else {
        direction = "top";
        type = "straight";
      }
    } else if (j1 > j0) {
      if (i1 < i0) {
        direction = "topRight";
        type = "diagonal";
      } else {
        direction = "bottomRight";
        type = "diagonal";
      }
    } else if (j1 < j0) {
      if (i1 < i0) {
        direction = "topLeft";
        type = "diagonal";
      } else {
        direction = "bottomLeft";
        type = "diagonal";
      }
    } else {
      return false;
    }

    Piece testPiece, movingFromPiece;

    movingFromPiece = Board.getPiece(i0, j0);

    if (type.equals("diagonal")) {

      int movingDistanceX = Math.abs(j1 - j0);
      int movingDistanceY = Math.abs(i1 - i0);

      if (movingDistanceX != movingDistanceY) {
        return false;
      }

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
    } else {
      if ((direction.equals("right")) || (direction.equals("left"))) {
        int movingDistance = Math.abs(j1 - j0);

        for (int dist = 1; dist <= movingDistance; dist++) {
          if ((direction.equals("right"))) {
            testPiece = Board.getPiece(i0, j0 + dist);

            if ((testPiece != null) && (dist != movingDistance)) {
              return false;
            } else if ((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))) {
              return true;
            }
          } else {
            testPiece = Board.getPiece(i0, j0 - dist);

            if ((testPiece != null) && (dist != movingDistance)) {
              return false;
            } else if ((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))) {
              return true;
            }
          }
        }
      } else {
        int movingDistance = Math.abs(i1 - i0);

        for (int dist = 1; dist <= movingDistance; dist++) {

          if (direction.equals("top")) {
            testPiece = Board.getPiece(i0 - dist, j0);

            if ((testPiece != null) && (dist != movingDistance)) {
              return false;
            } else if ((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))) {
              return true;
            }
          } else {
            testPiece = Board.getPiece(i0 + dist, j0);

            if ((testPiece != null) && (dist != movingDistance)) {
              return false;
            } else if ((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))) {
              return true;
            }
          }
        }
      }
    }


    return false;
  }
}
