
public class Bishop extends Piece {
	
	public Bishop(String color, int num, int letter) {
        	super(color,num,letter);
     	}
	
	private int genInc(int n1, n2) {
		if (n1 > n2)
			return -1;
		return 1;
	}
	
	@Override
     	public boolean impededCheck(Board board, int num, int letter) { //skeleton
     		int selNum = super.getNum();
     		int selLetter = super.getLetter();
     		int numInc = genInc(selNum,num);
     		int letterInc = genInc(selLetter,letter);
     		while ((selNum != num) && (selLetter != letter) {
     			if (!board.isEmpty(selNum,selLetter))
     				return true;
     		}
     		return false;
     	}	
     
     	@Override
     	public boolean testMove(Board board, int num, int letter) { //Moves diagonally and vertically
        	Location loc = board.getLocAt(num,letter);
        	Piece p = loc.getPiece();
        	if (!super.notSameColor(p))
        		return false;
       		double slope = (1.0 * Math.abs(super.getNum()-num))/Math.abs(super.getLetter()-letter);
       		if (slope == 1.0)
       			return impededCheck(board,num,letter);
       		return false;
    	}
}
