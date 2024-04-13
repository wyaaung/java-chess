package chess;

import java.util.Scanner;

public class Game {
  private static boolean gameEnd = false;
  private static Scanner scanner = new Scanner(System.in);

  public static void play() {
    boolean turnWhite = true;
    Piece moveFromPiece;
    CheckInput obj1 = new CheckInput();

    while (!gameEnd) {

      int iIn, jIn, iOut, jOut;

      if (turnWhite) {
        System.out.println("------ Whites Move ------");
      } else {
        System.out.println("------ Blacks Move ------");
      }

      System.out.println("> Enter Origin:");
      String originalPiece = scanner.nextLine();

      if (originalPiece.equalsIgnoreCase("end")) {
        gameEnd = true;
        break;
      }

      if (obj1.checkCoordinateValidity(originalPiece)) {
        String preProcessedOriginalPiece = originalPiece.trim().toLowerCase();
        iIn = Character.getNumericValue(preProcessedOriginalPiece.charAt(0)) - 1;

        switch (preProcessedOriginalPiece.charAt(1)) {
          case 'a':
            jIn = 0;
            moveFromPiece = Board.getPiece(iIn, 0);
            break;
          case 'b':
            jIn = 1;
            moveFromPiece = Board.getPiece(iIn, 1);
            break;
          case 'c':
            jIn = 2;
            moveFromPiece = Board.getPiece(iIn, 2);
            break;
          case 'd':
            jIn = 3;
            moveFromPiece = Board.getPiece(iIn, 3);
            break;
          case 'e':
            jIn = 4;
            moveFromPiece = Board.getPiece(iIn, 4);
            break;
          case 'f':
            jIn = 5;
            moveFromPiece = Board.getPiece(iIn, 5);
            break;
          case 'g':
            jIn = 6;
            moveFromPiece = Board.getPiece(iIn, 6);
            break;
          case 'h':
            jIn = 7;
            moveFromPiece = Board.getPiece(iIn, 7);
            break;
          default:
            System.out.println("Wrong Input");
            continue;
        }

        System.out.println("> Enter Destination:");
        String destPiece = scanner.nextLine();

        if (destPiece.toLowerCase().equals("end")) {
          gameEnd = true;
          break;
        }

        if (obj1.checkCoordinateValidity(destPiece)) {
          String preProcessedDestPiece = destPiece.trim().toLowerCase();
          iOut = Character.getNumericValue(preProcessedDestPiece.charAt(0)) - 1;

          switch (preProcessedDestPiece.charAt(1)) {
            case 'a':
              jOut = 0;
              break;
            case 'b':
              jOut = 1;
              break;
            case 'c':
              jOut = 2;
              break;
            case 'd':
              jOut = 3;
              break;
            case 'e':
              jOut = 4;
              break;
            case 'f':
              jOut = 5;
              break;
            case 'g':
              jOut = 6;
              break;
            case 'h':
              jOut = 7;
              break;
            default:
              System.out.println("Wrong Input");
              continue;
          }


          moveFromPiece = Board.getPiece(iIn, jIn);
          if (moveFromPiece.isLegitMove(iIn, jIn, iOut, jOut)) {
            gameEnd = Board.movePiece(iIn, jIn, iOut, jOut, moveFromPiece);
            turnWhite = !turnWhite;
          }
        }

        if (!gameEnd) {
          Board.printBoard();
        }

      }
    }
  }

  public static void main(String args[]) {
    Board.initialiseBoard();
    Board.initialisePieces();
    Board.printBoard();
    Game.play();
  }
}
