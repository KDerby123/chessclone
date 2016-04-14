//Moves diagonally, vertically, and horizontally
public class Queen extends Piece {

    public Queen(String color,int num, int letter) {
	super(color,num,letter);
    }
	
    public boolean testMove(Board board, int num, int letter) { //takes in a Board, a x value, and a y checks if the move is valid
        Location l = b.getLocAt(num,letter);
        Piece p = l.getPiece(); //
        if (!super.notSameColor(p))
           return false;
           
    }
}
