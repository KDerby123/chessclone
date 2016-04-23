import java.util.ArrayList;
public abstract class Piece {

	private Color color;
	private Coordinate coord;

	public Piece(Color color, int num, int letter) {
		this.coord = new Coordinate(num, letter);
		this.color = color;
	}

	public Piece(Color color, Coordinate coord) {
		this.color = color;
		this.coord = coord;
	}

	/**
	 * Constructs a Piece object
	 * 
	 * @param color
	 *            the Color (White or Black)
	 * @param notation
	 *            the notation of the coordinate (ie a4 or d8)
	 */
	public Piece(Color color, String notation) {
		this.color = color;
		this.coord = Coordinate.decode(notation);
	}

	/**
	 * Checks if move is impeded by other peices
	 * 
	 * @param Board
	 *            b board of move
	 * @param Coordinate
	 *            the coordinate of the move
	 * @return true if move is impeded, false otherwise
	 * */
	protected abstract boolean isImpeded(Board b, Coordinate move);

	/**
	 * Checks if move is valid. SHOULD USE isImpeded(Board, Coordinate)
	 * 
	 * @param Board
	 *            b board of move
	 * @param Coordinate
	 *            the coordinate of the move
	 */
	protected abstract boolean testMove(Board b, Coordinate move);

	protected abstract ArrayList<Coordinate> getMoveSpan();
	
	public boolean hasMove(Board board, King king,Player oppPlayer) {
		ArrayList<Coordinate> coords = getMoveSpan();
		for (Coordinate coord : coords)
			if (testMove(board,coord) && ChessGame.testCheck(boord,super.getCoordinate(),coord,oppPlayer))
				return true;
		return false;
	}
	/**
	 * Checks if opponent piece is at location (is of other color)
	 * 
	 * @param loc
	 *            the Location of the piece
	 */
	public boolean isSameColor(Location loc) {
		if (loc.getPiece() == null)
			return false;
		return !(loc.getPiece().getColor().equals(this.color));
	}

	
	public static int genInc(int n1, int n2) {
		if (n1 > n2)
			return -1;
		if (n1 == n2)
			return 0;
		return 1;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Coordinate getCoord() {
		return coord;
	}
	
	public int getNum() {
		return coord.getNum();
	}
	
	public int getLetter() {
		return coord.getLetter();
	}

	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}

}
