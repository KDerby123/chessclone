
public class PieceBoard extends Board {
	public PieceBoard() {
		super();
	}
	
	public void boardInit() {
		String color;
		Piece piece;
		for (int i = 0;i<8;i++) {
			for (int k = 0;k<8;k++) {
				if (i<2)
					color = "white";
				if (i>=6)
					color = "black";
				else
					color = null;
				if ((i == 0) || (i == 7)) 
					if ((k == 0) || (k == 7))
						piece = new Rook(color);
					else if ((k==1) || (k==6))
						piece = new Knight(color);
					else if ((k==2) || (k==5))
						piece = new Bishop(color);
					else if (k == 3)
						piece = new King(color);
					else if (k == 4)
						piece = new Queen(color);
				if ((i == 1) || (i == 6))
					piece = new Pawn(color);
				else
					piece = null;
			super.addToBoard(new Location(i,k,piece),i,k);
			}
		}
	}
}
