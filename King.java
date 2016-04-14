
public class King extends Piece {
	
    	public King(String color, int num, int letter) {
    		super(color,num,letter);
	}
    
	public boolean impededCheck(Board board, int num, int letter) { //skeleton
    		return false; //Kings can't be impeded
	}
	
	public boolean testMove(Board board, int num, int letter) { //Tests whether the move is in a 1 square radius and a valid move.
        	Location l = b.getLocAt(num,letter); 
        	Piece p = l.getPiece();
        	if (!super.notSameColor(p))
        		return false;
        	return ((Math.abs(super.getNum()-num) <= 1) && (Math.abs(super.getLetter()-letter) <= 1));
    	
	}
	
	public boolean isInCheck(Board board, ArrayList<Piece> pieces) { // This method will check if the king is in check. It takes in a board
		for (Piece p : pieces) {                                 //and the opposing player's pieces and tests whether 
			if (p.testMove(board,super.getNum(),super.getLetter()) // they can reach the king. It will return true if so.
				return true;
		return false;
	}
	
	
}
