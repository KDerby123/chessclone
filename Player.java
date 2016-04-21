import java.util.ArrayList;
public class Player {
	private ArrayList<Piece> pieces;
	private ArrayList<String> moves;
	private Color color;
	
	public abstract void makeMove();
	
	public ArrayList<Piece> getPieces() { //gets the Player's pieces
		return pieces;
	}
	
	public void getMoves() { //gets the players moves
		return moves;
	}
	
	public void addMove(String move) //Adds a move to the player's list of moves
		moves.add(move);
	}
	
	public String getLastMove() { //gets the last move
		if (moves.size() > 0)
			return moves.get(moves.size()-1);
		return "No Moves";
	}
	
	public void removePiece(Piece p) {
		for (int i = 0;i<pieces.size();i++)
			if (p == piece)
				pieces.remove(i);
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
}
