
public class Rook extends Piece {

    	public Rook(String color,int num,int letter) {
		super(color,num,letter);
    	}
    	
    	public boolean impededCheck(Board board, int num, int letter) { //skeleton
    		int selNum = super.getNum();
		int selLetter = super.getLetter();
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
	
    	public boolean testMove(Board board, int num, int letter) { //Moves horizontally and vertically
        	Location l = b.getLocAt(num,letter);
        	Piece p = l.getPiece();
        	if (!super.notSameColor(p))
           		return false;
        	if ((super.getNum() != num) && (super.getLetter() != letter))
        		return false;
        	return impededCheck(board,num,letter);
    } 
}
