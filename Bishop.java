
public class Bishop extends Piece {
	
	public Bishop(Color color, Coordinate coord) {
        	super(color,coord);
     	}
	
	@Override
     	public boolean impededCheck(Board board, Coordinate coord) { //skeleton
     		int selNum = super.getNum();
     		int selLetter = super.getLetter();
     		int num = coord.getNum();
     		int letter == coord.getLetter()
     		int numInc = Piece.genInc(selNum,num);
     		int letterInc = Piece.genInc(selLetter,letter);
     		while ((selNum != num) && (selLetter != letter) {
     			if (!board.isEmpty(selNum,selLetter))
     				return true;
     		}
     		return false;
     	}	
     
     	@Override
     	public boolean testMove(Board board, Coordinate coord) { //Moves diagonally and vertically
        	Location loc = board.getLocAt(num,letter);
        	Piece p = loc.getPiece();
        	int num = coord.getNum();
        	int letter = coord.getLetter();
        	if (!super.notSameColor(p))
        		return false;
       		double slope = (1.0 * Math.abs(super.getNum()-num))/Math.abs(super.getLetter()-letter);
       		if (slope == 1.0)
       			return impededCheck(board,coord);
       		return false;
    	}
    	
    	public String toString() {
    		return "B" + super.toString();
    	}
}
