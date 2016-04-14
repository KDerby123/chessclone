
public class Board {
	private Location[][] board; //A board of Locations; 8x8 with the first [] detailing the number(y) axis, and the second [] the letter(x) axis
	private Player white;
	private Player black;
	
	public Board(Player w, Player b) {
		board = new Square[8][8];
		white = w;
		black = b;
		boardInit();
	}
	
	public void boardInit() {
		String color;
		Piece piece;
		for (int i = 0;i<8;i++) { //"number"(y) axis
			for (int k = 0;k<8;k++) { //"letter"(x) axis
				if (i<2)
					color = "white";
				if (i>=6)
					color = "black";
				else
					color = null;
				if ((i == 0) || (i == 7)) 
					if ((k == 0) || (k == 7))
						piece = new Rook(color,i,k);
					else if ((k==1) || (k==6))
						piece = new Knight(color,i,k);
					else if ((k==2) || (k==5))
						piece = new Bishop(color,i,k);
					else if (k == 3)
						piece = new King(color,i,k);
					else if (k == 4)
						piece = new Queen(color,i,k);
				if ((i == 1) || (i == 6))
					piece = new Pawn(color,i,k);
				else
					piece = null;
			super.addToBoard(new Location(i,k,piece),i,k);
			}
		}
	}
	
	public Location getLocAt(int num, int letter) { //access a location on the board using notation
		return board[num][letter];
	}
}
