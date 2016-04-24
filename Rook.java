
public class Rook extends Piece {

    	public Rook(Color color, Coordinate coord) {
		super(color, coord);
    	}
    	
    	public boolean impededCheck(Board board, Coordinate coord) { //skeleton
    		int selNum = super.getNum();
		int selLetter = super.getLetter();
		int num = coord.getNum();
		int letter = coord.getLetter();
		int numInc = Piece.genInc(selNum,num);
		int letterInc = Piece.genInc(selLetter,letter);
    		while ((selNum != num) || (selLetter != letter)) {
    			if (!board.isEmpty(selNum,selLetter)
    				return true;
    			selNum += numInc;
    			selLetter += letterInc;
    		}
    		return false;
    	}
	
    	public boolean testMove(Board board, Coordinated coord) { //Moves horizontally and vertically
        	Location l = b.getLocAt(coord);
        	Piece p = l.getPiece();
        	int num = coord.getNum();
        	int letter = coord.getLetter();
        	if (!super.notSameColor(p))
           		return false;
        	if ((super.getNum() != num) && (super.getLetter() != letter))
        		return false;
        	return impededCheck(board,num,letter);
    	}
    	
    	public ArrayList<Coordinate> getMoveSpan() {
    		ArrayList<Coordinate> coords = new ArrayList<Coordinate>();
    		spanHelper(coords,1,0);
    		spanHelper(coords,-1,0);
    		spanHelper(coords,0,1);
    		spanHelper(coords,0,-1);
    		return coords;
    	}
    	
    	public void spanHelper(coords,int i, int k) {
    		int numInc = i;
    		int letterInc = k;
    		Coordinate coord = new Coordinate(super.getNum()+numInc,super.getLetter()+letterInc);
    		while (Board.isValid(coord)) {
    			coords.add(coord);
    			coord = new Coordinate(super.getNum()+numInc,super.getLetter()+letterInc);
    		}
    	}
    
    public String toString() {
    	return "R" + Coordinate.notatedLoc(super.getCoordinate());
    }
}
