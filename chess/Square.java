package chess;

public class Square extends Piece {
  public Square(PieceColour colour) {}

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    return false;
  }
}
