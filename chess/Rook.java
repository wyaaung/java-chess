package chess;

public class Rook extends Piece {
  public Rook(PieceColour colour) {
    this.colour = colour;
    if (colour == PieceColour.WHITE){
        this.setSymbol("\u2656");
    }
    else{
        this.setSymbol("\u265C");
    }
  }

  @Override
  public boolean isLegitMove(int i0, int j0, int i1, int j1) {
    String direction;

    if(i1 == i0){
  if (Math.abs(j1 - j0)< 8){
    if(j1 > j0){
      direction = "right";
    }
    else{
      direction = "left";
    }
  }
  else{
    return false;
  }
}
else if(j1 == j0){
  if (Math.abs(i1-i0)<8){
    if(i1 > i0){
      direction = "bottom";
    }
    else{
      direction = "top";
    }
  }
  else{
    return false;
  }
}
else{
  return false;
}

Piece testPiece , movingFromPiece;

movingFromPiece = Board.getPiece(i0,j0);

if((direction.equals("right")) || (direction.equals("left"))){
  int movingDistance = Math.abs(j1 - j0);

  for(int dist = 1; dist <= movingDistance; dist++){
    if((direction.equals("right"))){
      testPiece = Board.getPiece(i0,j0 + dist);
      
      if((testPiece != null) && (dist != movingDistance)){
        return false;
      }
      else if((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))){
        return true;
      }
    }
    else{
      testPiece = Board.getPiece(i0,j0 - dist);
      
      if((testPiece != null) && (dist != movingDistance)){
        return false;
      }
      else if((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))){
        return true;
      }
    }
  }
}
else{ 
  int movingDistance = Math.abs(i1 - i0); 
    
  for(int dist = 1; dist <= movingDistance; dist++){
    
    if(direction.equals("top")){
      testPiece = Board.getPiece(i0 - dist,j0);
      
      if((testPiece != null) && (dist != movingDistance)){
        return false;
      }
      else if((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))){
        return true;
      }
    }
    else{
      testPiece = Board.getPiece(i0 + dist,j0);
      
      if((testPiece != null) && (dist != movingDistance)){
        return false;
      }
      else if((dist == movingDistance) && ((testPiece == null) || (testPiece.getColour() != movingFromPiece.getColour()))){
        return true;
      }
    }
  }
}
return false;
  }
}
