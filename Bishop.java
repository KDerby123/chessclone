
public class Bishop extends Piece {
	
     public Bishop(String c,int x,int y) {
          super(c,x,y);
     }
	
     public boolean testMove(Board b, int x, int y) { //Moves diagonally and vertically
        Location l = b.getLocAt(x,y);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
       
           
    }
}
