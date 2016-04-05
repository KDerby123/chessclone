
public class Board {
	private Square[][] board;
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
		for (int i = 0;i<8;i++) {
			for (int k = 0;k<8;k++) {
				if (i<2)
					color = "white";
				if (i>7)
					color = "black"; 
				board[i][k] = new Square();
			}
		}
	}
}
