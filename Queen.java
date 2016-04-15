//Moves diagonally, vertically, and horizontally
public class Queen extends Piece {

	public Queen(String color,int num, int letter) {
		super(color,num,letter);
    	}
	
	private int genInc(int n1, int n2) { //generates an increment  based on the relationship of the two ints
		if (n1 > n2) 
    			numInc = -1; 
    		else if (n1 < n2)
    			numInc = 1;
    		else
    			numInc = 0;
	}
	    
	public boolean impededCheck(Board board, int num, int letter) {
		int selNum = super.getNum();
		int selLetter = super.getLetter();
		int numInc = genInc(selNum,num);
		int letterInc = genInc(selLetter,letter);
    		while ((selNum != num) || (selLetter != letter)) {
    			if (!board.isEmpty(selNum,selLetter)
    				return true;
    			selNum += numInc;
    			selLetter += letterInc;
    		}
    		return false;
    	}
	
	public boolean testMove(Board board, int num, int letter) { //takes in a Board, a x value, and a y checks if the move is valid
        	Location loc = board.getLocAt(num,letter);
        	Piece p = loc.getPiece(); //
        	double slope;
        	if (!super.notSameColor(p))
        		return false;
        	if (super.getLetter()-letter != 0)
        		slope = (Math.abs(super.getNum()-num) * (1.0))/Math.abs(super.getLetter()-num);
        	else
        		slope = 0.0;
       		if ((slope = 0.0) || (slope == 1.0))
       			return impededCheck(board,num,letter);
       		return false;
	}
}
