import java.util.ArrayList;
public abstract class Player {
	private ArrayList<Piece> pieces;
	private ArrayList<String> moves;
	public abstract void makeMove();
	
	public ArrayList<Piece> getPieces() {
		return pieces;
	}
	
	public void addMove(String move) {
		moves.add(move);
	}
	
	public String getLastMove() {
		if (moves.size() > 0)
			return moves.get(moves.size()-1);
		return "No Moves";
	}
}
