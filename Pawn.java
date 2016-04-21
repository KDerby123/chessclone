
public class Pawn extends Piece {
	public boolean hasMoved;
	
	public Pawn(Color color, Coordinate coord) {
		super(color, coord);
		hasMoved = false;
	}
	
	@Override
	public boolean impededCheck(Board board, Coordinate coord) { //implemented abstract method from Piece; returns true if Pawn is
		return (!board.isEmpty(coord)) //impeded on it's path to the square
	}
	
	@Override
	public boolean testMove(Board board, Coordinate coord) { //I'll do this, as it has a weird move scheme
	        Location l = board.getLocAt(coord) ;
	        Piece p = l.getPiece();
	        int num = coord.getNum();
	        int letter = coord.getLetter();
		if (!super.notSameColor(p)) //checks whether the piece is of the same color, A king check is not
		   	return false; //needed due to the fact that this would be an instance of checkmate
		else
			if (p == null)  //if location is empty
				if ((super.getLetter() == letter) //If piece is on same letter rank
					if ((super.getNum() == num-2) && (!impededCheck(board,coord)) //2 square forward move check
						return hasMoved; //returns whether this Pawn has moved
					else
						return super.getNum() == num-1; //returns the only other possible move: 1 square forward
				else if ((Math.abs(super.getLetter()-letter) == 1) && (super.getNum() == num-1)) //en passant check
					return (board.getPlayerW().getLastMove().equals(Coordinate.notatedPos(num-1,letter)));
				else
					return false; //returns false atfer checking all possible cases
			else
				return ((Math.abs(super.getLetter()-letter) == 1) && (super.getNum() == num-1)); //take move
				
	}
}
