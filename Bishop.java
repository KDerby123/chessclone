
public class Bishop extends Piece {
	
     public Bishop(String color, int num, int letter) {
          super(color,num,letter);
     }
	
     public boolean impededCheck(Board board, int num, int letter) { //skeleton
    	
     }
     
     public boolean testMove(Board board, int num, int letter) { //Moves diagonally and vertically
        Location l = b.getLocAt(num,letter);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
       
           
    }
}
