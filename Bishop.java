
public class Bishop extends Piece {
	
     public Bishop(String color, int num, int letter) {
          super(color,num,letter);
     }
	
	@Override
     public boolean impededCheck(Board board, int num, int letter) { //skeleton
     int n, l;
    	for (n = num, l = letter; n <= 7 && l <= 7 && n >=0 && l >= 0)
    	
    	
    	
    	return false;
     }
     
     private boolean is
     
     @Override
     public boolean testMove(Board board, int num, int letter) { //Moves diagonally and vertically
        Location loc = board.getLocAt(num,letter);
        Piece p = loc.getPiece();
        if (!super.notSameColor(p))
           return false;
       
           
    }
}
