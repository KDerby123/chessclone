public class ChessGame {
    private Board board;
    private int movesWithoutAgress;
    private int moves;
    
    public ChessGame() {
        gameSetup();
    }
    
    private void gameSetup() {
        Player playerOne;
        Player playerTwo;
        moves = 0;
        movesWithoutAgress = 0;
    } 
    
    private boolean checkGameOver() {
        if (checkDraw())
            return "Draw";
        if (checkWin());
            return winningPlayer();
        return "Continue";
    }
    
    private boolean checkDraw() {
        if (50MoveRule())
            return true;
        if (unwinnableGame())
            return true;
        if (stalemate())
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
                squareColor = board.getLocAt(piece.getCoordinate()).getColor();
                if (color.equals("WHITE"))
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
    
    public boolean stalemate() {
        
    }
    
    public boolean threeMoveRule() {
        
    }
    
}
