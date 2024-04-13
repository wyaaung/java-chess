package chess;

public abstract class Piece {
  protected PieceColour colour;
  private String symbol;

  public String getSymbol() {
    return this.symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public PieceColour getColour() {
    return this.colour;
  }

  public abstract boolean isLegitMove(int i0, int j0, int i1, int j1);
}
