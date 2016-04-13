
public class King extends Piece {
	
    public King(String c) {
		super(c);
    }
	
    public boolean testMove(Board b, int x, int y) { //I will do this one - Kika
        Location l = b.getLocAt(x,y);
        if (!super.notSameColor(l))
           return false;
        Piece p = l.getPiece();
           
    }
	
	public boolean isInCheck() { // This method will check if the king is in check
		//code 
		return false;
	}
}
