
public class Bishop extends Piece {
	
     public Bishop(String color, int num, int letter) {
          super(color,num,letter);
     }
	
	@Override
     public boolean impededCheck(Board board, int num, int letter) { //skeleton
     int n, l;
    	for (n = num + 1, l = letter + 1; isValid(n, l); n++, l++) {
    		if(!board.isEmpty())
    			return false;
    	}
    	for (n = num - 1, l = letter + 1; isValid(n, l); n--, l++) {
    		if(!board.isEmpty())
    			return false;
    	}
       for (n = num - 1, l = letter - 1; isValid(n, l); n--, l--) {
    		if(!board.isEmpty())
    			return false;
    	}
     for (n = num + 1, l = letter - 1; isValid(n, l); n++, l--) {
    		if(!board.isEmpty())
    			return false;
    	}
    	return false;
     }
     
     	private static boolean isValid(int num, int letter) {
		return num <= 7 && letter <= 7 && num >=0 && letter >= 0;
	}
     
     @Override
     public boolean testMove(Board board, int num, int letter) { //Moves diagonally and vertically
        Location loc = board.getLocAt(num,letter);
        Piece p = loc.getPiece();
        if (!super.notSameColor(p))
           return false;
       

           
    }
}
