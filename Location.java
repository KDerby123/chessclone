
public class Location {
	private String notatedLoc;
	private Piece piece;
	private int xLoc;
	private int yLoc;
	
	public Location(Piece p, int x, int y) {
		piece = p;
		xLoc = x;
		yLoc = y;
		notatedLoc = procCoords(x,y);
	}
	
	public static String procCoords(int x, int y) {
		String a = "";
		char b = 'a';
		b += x;
		a += b;
		return a + y;
	}
	
	public String getNotation() {
		return notatedLoc;
	}
	
	public int getX() {
		return xLoc;
	}
	
	public int getY() {
		return yLoc;
	}
	
	public Piece getPiece() {
		return piece;
	}
	
}
