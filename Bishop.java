
public class Bishop extends Piece {
	
     public Bishop(String color, int num, int letter) {
          super(color,num,letter);
     }
	
	@Override
     public boolean impededCheck(Board board, int num, int letter) { //skeleton
    	
    	
    	
     }
     
     @Override
     public boolean testMove(Board board, int num, int letter) { //Moves diagonally and vertically
        Location loc = board.getLocAt(num,letter);
        Piece p = loc.getPiece();
        if (!super.notSameColor(p))
           return false;
       
           
    }
}
