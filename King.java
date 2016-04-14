
public class King extends Piece {
	
    public King(String color, int num, int letter) {
    	super(color,num,letter);
    }
    
    public boolean impededCheck(Board board, int num, int letter) { //skeleton
    	return false //Kings can't be impeded
    }
	
    public boolean testMove(Board board, int num, int letter) { //I will do this one - Kika
        Location l = b.getLocAt(num,letter);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
        return ((Math.abs(super.getNum()-num) <= 1) && (Math.abs(super.getLetter()-letter) <= 1));
    }
	
	public boolean isInCheck() { // This method will check if the king is in check
		//code 
		return false;
	}
	
	public boolean checkMate() {
		
	}
}
