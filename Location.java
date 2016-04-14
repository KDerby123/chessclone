
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
	
	public static String procCoords(int num, int letter) { //returns the location in terms of notation
		String a = "";
		char b = 'a';
		b += letter;
		a += b;
		return a + (num+1);
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
