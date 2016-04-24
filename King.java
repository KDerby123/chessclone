import java.util.ArrayList;
public class King extends Piece {
	
    	public King(Color color, int num, int letter) {
    		super(color,num,letter);
	}
    
	public boolean impededCheck(Board board, int num, int letter) { //skeleton
    		return false; //Kings can't be impeded
	}
	
	public boolean testMove(Board board, Coordinate coord) { //Tests whether the move is in a 1 square radius and a valid move.
        	Location l = b.getLocAt(Coordinate coord); 
        	Piece p = l.getPiece();
        	if (!super.notSameColor(p))
        		return false;
        	return ((Math.abs(super.getNum()-num) <= 1) && (Math.abs(super.getLetter()-letter) <= 1));
    	
	}
	
	public boolean isInCheck(Board board, Player player) {
		ArrayList<Piece> pieces = player.getPieces// This method will check if the king is in check. It takes in a board
		for (Piece p : pieces) {                                 //and the opposing player's pieces and tests whether 
			if (p.testMove(board,super.getCoordinate()) // they can reach the king. It will return true if so.
				return true;
		return player.getKing().testMove(board,super.getCoordinate());
	}
	
	public ArrayList<Coordinate> getMoveSpan() {
    		ArrayList<Coordinate> coords = new ArrayList<Coordinate>();
    		for (int i = -1;i<=1;i++) {
    			for(int k = -1;i<=1;i++) {
    				if ((i != 0) || (k != 0))
    					spanHelper(coords,i,k);
    			}
    		}
    		return coords;
    	}
    	
    	private void spanHelper(ArrayList<Coordinate> coords, int numInc, int letterInc) {
    		Coordinate coord = new Coordinate(super.getNum()+numInc, super.getLetter()+letterInc);
    		if (Board.isValid(coord))
    			coords.add(coord);
    	}
	
	public String toString() {
		return "K" + Coordinate.notatedLoc(super.getCoordinate());
	}
	
	
}
