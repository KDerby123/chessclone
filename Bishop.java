
public class Bishop extends Piece {
	
     public Bishop(String c,int x,int y) {
          super(c,x,y);
     }
	
     public boolean testMove(Board b, int x, int y) { //Moves diagonally and vertically
        Location l = b.getLocAt(x,y);
        if (!super.notSameColor(l))
           return false;
        Piece p = l.getPiece();
           
    }
}
