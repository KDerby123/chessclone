
public class Knight {

    public Knight(String c, int x, int y) {
        super(c,x,y);
    }
    
    public boolean testMove(Board b, int x, int y) { //Moves in a L fashion, 1 square vertically, 2 squares horizontally
        Location l = b.getLocAt(x,y);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
        
           
    }
}
