public abstract class Piece{
        private String color;
        private String notatLoc;
	private int numLoc;
        private int letterLoc;
	
	
	public Piece(String c, int num, int letter) {
		numLoc = x;
                letterLoc = y;
                color = c;
                notatLoc = Location.procCoords(x,y);
	}
	
	public abstract boolean impededCheck(Board b, int num, int letter); //this checks if the move provided is impeded; used with
	//testMove() method
        public abstract boolean testMove(Board b, int num, int letter); //tests whether the move imported is a valid move

        public boolean notSameColor(Location l) { //Tests whether the piece at the Location is of the same color, returns true if not
                return ((l.getPiece() == null) || (!l.getPiece().getColor().equals(color)));
        }

        public String getColor() {
                return color;
        }
        
        public String getNotatLoc() {
                return notatLoc;
        }
        
        public int getNum() {
                return numLoc;
        }
       
        public int getLetter() {
                return letterLoc;
        }
	
	
	

}
