
public class Location {
	private String notatedLoc;
	private Piece piece;
	private int numLoc;
	private int letterLoc;
	
	public Location(Piece p, int num, int letter) { //constructor, takes in a Piece, number coord, and a letter coord. Processes
		piece = p; //these coordinates into a notated String to be stored.
		numLoc = num;
		letterLoc = letter;
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
	
	public int getNum() { //returns the "number" coordinate
		return numLoc;
	}
	
	public int getLetter() { //returns the "letter" coordinate
		return letterLoc;
	}
	
	public Piece getPiece() { //returns the Piece object in the Location
		return piece;
	}
	
}
