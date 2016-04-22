
public class Board {
	private final Location[][] BOARD; //A board of Locations; 8x8 with the first [] detailing the number(y) axis, and the second [] the letter(x) axis
	private final int LEFT_BOUND;
	private final int RIGHT_BOUND;
	private final int UP_BOUND;
	private final int DOWN_BOUND;
	private final Player WHITE_PLAYER;
	private final Player BLACK_PLAYER;
	
	public Board(Player w, Player b) {
		BOARD = new Location[8][8];
		LEFT_BOUND = 0;
		RIGHT_BOUND = BOARD.length;
		UP_BOUND = 0;
		DOWN_BOUND = BOARD[0].length;
		w.setColor(WHITE);
		b.setColor(BLACK);
		WHITE_PLAYER = w;
		BLACK_PLAYER = b;
		boardInit();
	}
	
	private void addToBoard(Location loc,int num, int letter) {
		BOARD[num][letter] = loc;
	}
	
	public boolean isEmpty(Coordinate coord) {
		int num = coord.getNum();
		int letter = coord.getLetter();
		return BOARD[num][letter].getPiece() == null;
	}
	
	private static boolean isValid(Coordinate coord) {
		int num = coord.getNum();
		int letter = coord.getLetter();
		return num <= RIGHT_BOUND && letter <= DOWN_BOUND && num >= LEFT_BOUND && letter >= UP_BOUND;
	}
	
	public void boardInit() {
		Color color;
		Color squareColor;
		Piece piece;
		Coordinate coord;
		for (int num = 0;num<8;num++) { //"number"(y) axis
			for (int letter = 0;letter<8;letter++) { //"letter"(x) axis
				coord = new Coordinate(num,letter);
				if (num<2)
					color = WHITE;
				if (num>=6)
					color = BLACK;
				if ((num == 0) || (num == 7)) 
					if ((letter == 0) || (letter == 7))
						piece = new Rook(color,coord);
					else if ((letter==1) || (letter==6))
						piece = new Knight(color,coord);
					else if ((letter==2) || (letter==5))
						piece = new Bishop(color,coord);
					else if (letter == 3)
						piece = new King(color,coord);
					else if (letter == 4)
						piece = new Queen(color,coord);
				if ((num == 1) || (num == 6))
					piece = new Pawn(color,coord);
				else
					piece = null;
				if (piece != null) 
					if (piece instanceof King)
						if (piece.getColor() == WHITE)
							WHITE_PLAYER.setKing(piece);
						else
							BLACK_PLAYER.setKing(piece);
					else if (num < 2)
							WHITE_PLAYER.addPiece(piece);
						else
							BLACK_PLAYER.addPiece(piece);
			if (num % 2 == letter % 2)
				squareColor = WHITE;
			else
				squareColor = BLACK;
			addToBoard(new Location(piece,coord,squareColor),num,letter);
			}
		}
	}
	
	public Location getLocAt(Coordinate coord) { //access a location on the board using notation
		int num = coord.getNum();
		int letter = coord.getLetter();
		return BOARD[num][letter];
	}
	
	public Piece replace(Coordinate to, Coordinate from) {
		Location to = getLocAt(to);
		Location from = getLocAt(from);
		Piece piece = to.getPiece();
		to.setPiece(from.getPiece());
		from.setPiece(null);
		return piece;
	}
	
	
	public Player getWhitePlayer() {
		return WHITE_PLAYER;
	}
	
	public Player getBlackPlayer() {
		return BLACK_PLAYER;
	}
}
