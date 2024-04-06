package chess;

public abstract class Piece {
  private String symbol;
  protected PieceColour colour;

  public String getSymbol() {
    return this.symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public PieceColour getColour() {
    return this.colour;
  }

  public  abstract boolean isLegitMove(int i0, int j0, int i1, int j1);
}
