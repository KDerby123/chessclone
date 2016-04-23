//A single game of chess
import java.util.ArrayList;
public class ChessGame {
    private final Board BOARD;
    private int movesWithoutAgress;
    private int moves;
    private boolean whiteTurn;
    
    public ChessGame(Player playerOne, Player playerTwo) {
        gameSetup(playerOne,playerTwo);
    }
    
    public boolean playGame() { //main game method
    	String result = "Continue";
    	Player currentPlayer;
    	while (result.equals("Continue"))
    		if (whiteTurn)
    			currentPlayer = BOARD.getWhitePlayer();
    		else
    			currentPlayer = BOARD.getBlackPlayer();
    		makeMove(currentPlayer);
    		result = checkGameOver()
    		whiteTurn = !whiteTurn;
    	}
    	displayResult(result);
    }
    
    public boolean replay() {
    	//asks to see if  a replay is wanted	
    }
    
    public void displayResult(String result) {
    	//Display the result
    }
    
    	public void makeMove(Player currentPlayer) {
    		Piece selectedPiece; = inputPiece();
		Coordinate destinationCoord;  = inputCoordinate();
		boolean successMove = false; 
		boolean capture;
		while (!successMove) {
			selectedPiece = inputPiece(); //this needs to take in the piece selected to move
			destinationCoord = inputCoordinate(); //This needs to take in the location of where to go selected
			capture =  (BOARD.getLocAt(destinationCoord).getPiece() != null);
			successMove = (piece.testMove(destinationCoord) && testCheck(selectedPiece.getCoordinate(),destinationCoord,currentPlayer));
    		}
    		player.addMove(selectedPiece + Coordinate.getNotation(destinationCoord);
    		if (player.getColor() == BLACK)
    			moves++;
    		if ((piece instanceof Pawn) || capture)
    			movesWithoutAgress = 0;
    		else
    			movesWithoutAgress++;
	}
    
    private void gameSetup(Player playerOne, Player playerTwo) {
    	if (oneGoesFirst()) {
    		white = playerOne;
    		black = playerTwo;
    	} else {
    		white = playerTwo;
    		black = playerOne;
    	}
        BOARD = new Board(white,black);
        whiteTurn = true;
        moves = 0;
        movesWithoutAgress = 0;
    } 
    
    private boolean oneGoesFirst() {
    	//asks player one if he/she wantsto go first, returns true if yes, false if not.
    }
    
    private String checkGameOver() {
        if (checkDraw())
            return "Draw";
        if (checkWin());
            return winningPlayer().getName() + " wins!";
        return "Continue";
    }
    
    private boolean checkWin() {
    	white = getWhitePlayer();
    	black = getBlackPlayer();
    	if (whiteTurn && white.getKing().isInCheck(BOARD,black.getPieces()))
    		return checkMate(white);
    	else if (!whiteTurn && black.getKing().isInCheck(BOARD,white.getPieces())
    		return checkMate(black);
    	return false;
    }
    
    private boolean checkMate(Player currentPlayer) {
    	ArrayList<Piece> pieces = currentPlayer.getPieces();
    	for (Piece piece : pieces) {
    		if (piece.hasMove())
    			return false;
    	}
    	return true;
    }
    
    private boolean checkDraw() {
        if (50MoveRule())
            return true;
        if (unwinnableGame())
            return true;
        if (stalemate(turn))
            return true;
        if (threeMoveRule())
            return true;
        return false;
    }
    
    private boolean 50MoveRule() {
        return movesWithoutAgress == 50;
    }
    
    private boolean unwinnableGame() {
        return (!matingMater(board.getWhitePlayer()) && !matingMater(board.getBlackPlayer()));
    }
    
    private boolean matingMater(Player player) {
        Color squareColor;
        int bishopWhiteCount;
        int bishopBlackCount;
        int bishopSum;
        int knightCount;
        ArrayList<Piece> pieces = player.getPieces();
        for (Piece piece : pieces) {
            if (piece instanceof Queen)
                return true;
            if (piece instanceof Rook)
                return true;
            if (piece instanceof Pawn)
                return true;
            if (piece instanceof Bishop) {
                squareColor = BOARD.getLocAt(piece.getCoordinate()).getColor();
                if (color == WHITE)
                    bishopWhiteCount++;
                else
                    bishopBlackCount++;
            }
            if (piece instanceof Knight)
                knightCount++;
        }
        bishopSum = bishopWhiteCount + bishopBlackCount;
        if (bishopSum == 0)
            return knightCount >= 3;
        if ((bishopSum >= 1) && (knightCount >= 1))
            return true;
        return (bishopWhiteCount >= 1) && (bishopBlackCount >= 1);
    }
    
    public boolean stalemate(Color color) {
        ArrayList<Piece> pieces;
        if (color == WHITE)
            pieces = board.getWhitePlayer().getPieces();
        else
            pieces = board.getBlackPlayer.getPieces
        for (Piece piece : pieces)
            if (piece.hasMove())
                return false;
        return true;
    }
    
    public boolean threeMoveRule() {
        ArrayList<String> whiteMoves = BOARD.getWhitePlayer().getMoves();
        ArrayList<String> blackMoves = BOARD.getBlackPlayer().getMoves();
        if ((whiteMoves.size() < 3) && (blackMoves.size() < 3))
            return false;
        return testLastMoves(whiteMoves) && testLastMoves(blackMoves);
    }
    
    private boolean testLastMoves(ArrayList<String> moves) {
        String move = moves.get(moves.size()-3);
        for (int i = 2;i>0;i--)
            if (!move.equals(moves.get(moves.size()-i)))
                return false;
        return true;
    }
    
    public boolean testCheck(Coordinate to, Coordinate from, Player player) { //Still needs to remove piece, and ignore the piece taken
		Piece tempPiece = BOARD.replace(to,from);
		King king = player.getKing();
		player.removePiece(tempPiece);
		if (king.isInCheck(BOARD)) {
		   BOARD.getLocAt(from).setPiece(BOARD.getLocAt(to).getPiece());
		   BOARD.getLocAt(to).setPiece(tempPiece);
		   player.addPiece(tempPiece)
		   return true;
		}
		return false;
	}
	
	public void promotePawn(Piece piece, String pieceName) {
		Piece newPiece;
		newPiece = promotedPiece(piece.getColor(),piece.getCoordinate(),pieceName);
		while (newPiece == null)
			newPiece = promotedPiece(piece.getColor(),piece.getCoordinate(),pieceName);
		BOARD.getLocAt(piece.getCoordinate()).setPiece(newPiece);
		if (piece.getColor() == WHITE)
			BOARD.getWhitePlayer().addPiece(newPiece);
		else
			BOARD.getBlackPlayer().addPiece(newPiece);
	}
	
	public Piece promotedPiece(Coordinate coord, Color color, String piece) {
		if (piece.equals("Queen"))
			return new Queen(color,coord);
		if (piece.equals("Rook"))
			return new Rook(color,coord);
		if (piece.equals("Knight"))
			return new Knight(color,coord);
		if (piece.equals("Bishop"))
			return new Bishop(color,coord);
		return null;
	}
	
	public Player winningPlayer() {
		if (whiteTurn)
			return BOARD.getBlackPlayer();
		else
			return BOARD.getWhitePlayer();
	}
	
	public Player getWhitePlayer() {
		return BOARD.getWhitePlayer();
	}
	
	public Player getBlackPlayer() {
		return BOARD.getBlackPlayer();
	}
}
