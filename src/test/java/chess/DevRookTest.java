package chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DevRookTest {

  @BeforeEach
  public void initBoard() {
    Board.initialiseBoard();
  }

  public void setUpAforRook() {
    //Black pieces
    Board.setPiece(0, 0, new Rook(PieceColour.BLACK));
    Board.setPiece(0, 1, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 2, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 3, new Queen(PieceColour.BLACK));
    Board.setPiece(0, 4, new King(PieceColour.BLACK));
    Board.setPiece(0, 5, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 6, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 7, new Rook(PieceColour.BLACK));
    Board.setPiece(1, 0, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 1, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 2, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 3, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 4, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 5, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 6, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 7, new Pawn(PieceColour.BLACK));

    //White pieces
    Board.setPiece(6, 0, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 1, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 2, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 3, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 4, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 5, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 6, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 7, new Pawn(PieceColour.WHITE));
    Board.setPiece(7, 0, new Rook(PieceColour.WHITE));
    Board.setPiece(7, 1, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 2, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 3, new Queen(PieceColour.WHITE));
    Board.setPiece(7, 4, new King(PieceColour.WHITE));
    Board.setPiece(7, 5, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 6, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 7, new Rook(PieceColour.WHITE));
  }

  public void setUpBforRook() {
    //Black pieces
    Board.setPiece(0, 0, new Rook(PieceColour.BLACK));
    Board.setPiece(0, 1, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 2, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 3, new Queen(PieceColour.BLACK));
    Board.setPiece(0, 4, new King(PieceColour.BLACK));
    Board.setPiece(0, 5, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 6, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 7, new Rook(PieceColour.BLACK));
    Board.setPiece(1, 1, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 2, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 3, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 4, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 5, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 6, new Pawn(PieceColour.BLACK));

    //White pieces
    Board.setPiece(6, 1, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 2, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 3, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 4, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 5, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 6, new Pawn(PieceColour.WHITE));
    Board.setPiece(7, 0, new Rook(PieceColour.WHITE));
    Board.setPiece(7, 1, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 2, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 3, new Queen(PieceColour.WHITE));
    Board.setPiece(7, 4, new King(PieceColour.WHITE));
    Board.setPiece(7, 5, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 6, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 7, new Rook(PieceColour.WHITE));
    //Board.printBoard();
  }

  public void setUpCforRook() {
    //Black pieces
    Board.setPiece(4, 3, new Rook(PieceColour.BLACK));
    Board.setPiece(0, 1, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 2, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 3, new Queen(PieceColour.BLACK));
    Board.setPiece(0, 4, new King(PieceColour.BLACK));
    Board.setPiece(0, 5, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 6, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 7, new Rook(PieceColour.BLACK));
    Board.setPiece(1, 1, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 2, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 3, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 4, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 5, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 6, new Pawn(PieceColour.BLACK));

    //White pieces
    Board.setPiece(6, 1, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 2, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 3, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 4, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 5, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 6, new Pawn(PieceColour.WHITE));
    Board.setPiece(5, 5, new Rook(PieceColour.WHITE));
    Board.setPiece(7, 1, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 2, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 3, new Queen(PieceColour.WHITE));
    Board.setPiece(7, 4, new King(PieceColour.WHITE));
    Board.setPiece(7, 5, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 6, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 7, new Rook(PieceColour.WHITE));
    //Board.printBoard();
  }

  public void setUpDforRook() {
    //Black pieces
    Board.setPiece(4, 3, new Rook(PieceColour.BLACK));
    Board.setPiece(0, 1, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 2, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 3, new Queen(PieceColour.BLACK));
    Board.setPiece(0, 4, new King(PieceColour.BLACK));
    Board.setPiece(0, 5, new Bishop(PieceColour.BLACK));
    Board.setPiece(0, 6, new Knight(PieceColour.BLACK));
    Board.setPiece(0, 7, new Rook(PieceColour.BLACK));
    Board.setPiece(1, 1, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 2, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 3, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 4, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 5, new Pawn(PieceColour.BLACK));
    Board.setPiece(1, 6, new Pawn(PieceColour.BLACK));

    //White pieces
    Board.setPiece(6, 1, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 2, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 3, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 4, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 5, new Pawn(PieceColour.WHITE));
    Board.setPiece(6, 6, new Pawn(PieceColour.WHITE));
    Board.setPiece(3, 4, new Rook(PieceColour.WHITE));
    Board.setPiece(7, 1, new Knight(PieceColour.WHITE));
    Board.setPiece(7, 2, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 3, new Queen(PieceColour.WHITE));
    Board.setPiece(7, 4, new King(PieceColour.WHITE));
    Board.setPiece(7, 5, new Bishop(PieceColour.WHITE));
    Board.setPiece(7, 6, new Knight(PieceColour.WHITE));
    Board.setPiece(5, 5, new Rook(PieceColour.WHITE));
    Board.printBoard();
  }


  @Test
  public void badMove1() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(7, 7);
    assertFalse(r.isLegitMove(7, 7, 5, 5));
  }


  @Test
  public void badMove3() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(0, 0);
    assertFalse(r.isLegitMove(0, 0, 3, 5));
  }


  @Test
  public void badMove5() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(0, 7);
    assertFalse(r.isLegitMove(0, 7, 7, 0));
  }


  @Test
  public void badMove7() {//knight move II
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(7, 7);
    assertFalse(r.isLegitMove(7, 7, 5, 6));
  }


  @Test
  public void badMove9() {
    setUpDforRook();
    Rook r = (Rook) Board.getPiece(3, 4);
    assertFalse(r.isLegitMove(3, 4, 3, 4));
  }


  @Test
  public void horizontalLeftWhiteBad() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(7, 7);
    assertFalse(r.isLegitMove(7, 7, 7, 5));
  }


  @Test
  public void horizontalRightWhiteBad() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(7, 0);
    assertFalse(r.isLegitMove(7, 0, 7, 5));
  }


  @Test
  public void verticalUpWhiteBad1() {//Moving to a white piece square
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(7, 0);
    assertFalse(r.isLegitMove(7, 0, 6, 0));
  }


  @Test
  public void verticalUpWhiteGood1() {
    setUpBforRook();
    Rook r = (Rook) Board.getPiece(7, 7);
    assertTrue(r.isLegitMove(7, 7, 5, 7));
  }


  @Test
  public void horizontalLeftBlackBad() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(0, 7);
    assertFalse(r.isLegitMove(0, 7, 0, 5));
  }


  @Test
  public void horizontalRightBlackBad() {
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(0, 0);
    assertFalse(r.isLegitMove(0, 0, 0, 6));
  }


  @Test
  public void verticalUpBlackBad() {
    setUpCforRook();
    Rook r = (Rook) Board.getPiece(4, 3);
    assertFalse(r.isLegitMove(4, 3, 1, 3));
  }


  @Test
  public void verticalDownBlackBad2() {//Moving to a white piece square
    setUpAforRook();
    Rook r = (Rook) Board.getPiece(0, 0);
    assertFalse(r.isLegitMove(0, 0, 1, 0));
  }


}
