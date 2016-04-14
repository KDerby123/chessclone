
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
		for (int num = 0;num<8;num++) { //"number"(y) axis
			for (int letter = 0;letter<8;letter++) { //"letter"(x) axis
				if (num<2)
					color = "white";
				if (num>=6)
					color = "black";
				else
					color = null;
				if ((num == 0) || (num == 7)) 
					if ((letter == 0) || (letter == 7))
						piece = new Rook(color,num,letter);
					else if ((letter==1) || (letter==6))
						piece = new Knight(color,num,letter);
					else if ((letter==2) || (letter==5))
						piece = new Bishop(color,num,letter);
					else if (letter == 3)
						piece = new King(color,num,letter);
					else if (letter == 4)
						piece = new Queen(color,num,letter);
				if ((num == 1) || (num == 6))
					piece = new Pawn(color,num,letter);
				else
					piece = null;
			super.addToBoard(new Location(piece,num,letter),num,letter);
			}
		}
	}
	
	public Location getLocAt(int num, int letter) { //access a location on the board using notation
		return board[num][letter];
	}
}
