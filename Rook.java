
public class Rook extends Piece {

    	public Rook(String color,int num,int letter) {
		super(color,num,letter);
    	}
    	
    	public boolean impededCheck(Board board, int num, int letter) { //skeleton
    		
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
