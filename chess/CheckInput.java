package chess;

public class CheckInput {
  public boolean checkCoordinateValidity(String input) {
    String preProcessed = input.trim().toLowerCase();

    int counter = 0;

    if (!preProcessed.isEmpty() && preProcessed.length() == 2 && !(preProcessed.contains(" ") || preProcessed.contains("\t"))){
			if(!Character.isDigit(preProcessed.charAt(1)) && Character.isDigit(preProcessed.charAt(0))){
				char SIDE_LETTERS[] = {'a','b','c','d','e','f','g','h'};

				for(int i = 0; i < SIDE_LETTERS.length; i++){
					if (SIDE_LETTERS[i] == preProcessed.charAt(1)){
						counter += 1;
						break;
					}
				}

				int convertedNum = Character.getNumericValue(preProcessed.charAt(0));

				if (convertedNum <= 8){
					counter += 1;
				}

				if (counter == 2){
					return true;
				}
				else{
					return false;
				}

			}
			else{
				return false;
			}
		}

    return false;
  }
}
