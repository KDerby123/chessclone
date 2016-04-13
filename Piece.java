import java.util.ArrayList;
public abstract class Piece{
        private String color;
        private String notatLoc;
	private int xLoc;
        private int yLoc;
	
	
	public Piece(String c, int x, int y) {
		xLoc = x;
                yLoc = y;
                color = c;
                notatLoc = Location.procCoords(x,y);
	}
	
        public abstract boolean testMove(); //tests whether the move imported is a valid move

        public boolean notSameColor(Location l) { //Tests whether the piece at the Location is of the same color, returns true if not
                return ((l.getPiece() == null) || (!l.getPiece().getColor().equals(getColor())));
        }

        public String getColor() {
                return color;
        }
        
        public String getNotatLoc() {
                return notatLoc;
        }
        
        public int getX() {
                return xLoc;
        }
       
        public int getY() {
                return yLoc;
        }
	
	
	

}
