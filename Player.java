import java.util.ArrayList;
public abstract class Player {
	private ArrayList<Piece> pieces;
	public abstract void makeMove();
	
	public ArrayList<Piece> getPieces() {
		return pieces;
	}
}
