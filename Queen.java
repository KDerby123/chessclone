//Moves diagonally, vertically, and horizontally
public class Queen extends Piece {

    public Queen(String c,int x, int y) {
	super(c,x,y);
    }
	
    public boolean testMove(Board b, int x, int y) { //takes in a Board, a x value, and a y checks if the move is valid
        Location l = b.getLocAt(x,y);
        Piece p = l.getPiece(); //
        if (!super.notSameColor(l))
           return false;
           
    }
}
