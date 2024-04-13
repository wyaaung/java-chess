package chess;

public class Square {
  private boolean hasPiece;
  private Piece piece;

  public boolean hasPiece() {
    return this.hasPiece;
  }

  public Piece getPiece() {
    return this.piece;
  }

  public void setPiece(Piece piece) {
    this.piece = piece;
    if (this.piece == null) {
      this.hasPiece = false;
    } else {
      this.hasPiece = true;
    }
  }

  public void removePiece() {
    this.hasPiece = false;
    this.piece = null;
  }
}
