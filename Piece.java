import java.util.ArrayList;
public abstract class Piece extends Location{
	private int val;
	
	
	public Piece(int x, int y) {
		super(x,y);
	}
	
	
	public abstract ArrayList<String> getMoves();
	

}