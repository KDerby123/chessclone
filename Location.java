public class Location {

	private Piece piece;
	private final Coordinate coord; // coordinate doesn't move for Location

	/**
	 * Constructs a new Location
	 * 
	 * @param piece
	 *            the Piece at this location
	 * @param num
	 *            the number coordinate
	 * @param letter
	 *            the letter coordinate
	 */
	public Location(Piece piece, int num, int letter) {
		this.piece = piece;
		this.coord = new Coordinate(num, letter);
	}

	/**
	 * Constructs a new Location
	 * 
	 * @param piece
	 *            the Piece at this location
	 * @param coord
	 *            the Coordinate
	 */
	public Location(Piece piece, Coordinate coord) {
		this.piece = piece;
		this.coord = coord;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Coordinate getCoord() {
		return coord;
	}

}
