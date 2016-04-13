
public class Rook extends Piece {

    public Rook(String c,int x,int y) {
	super(c,x,y);
    }
	
    public boolean testMove(Board b, int x, int y) { //Moves horizontally and vertically
        Location l = b.getLocAt(x,y);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
           
    }
}
