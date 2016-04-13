
public class Pawn extends Piece {
	
	public Pawn(String c) {
		super(c);
	}
	
	public abstract boolean testMove(Board b, int x, int y) { //I'll do this, as it has a weird move scheme
	        Location l = b.getLocAt(x,y) ;
	        Piece p = l.getPiece();
		if (!super.notSameColor())
		   return false;
		   
	}
}
