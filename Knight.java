
public class Knight {

    public Knight(String c, int x, int y) {
        super(c,x,y);
    }
    
    public boolean impededCheck(Board board, int num, int letter) {
        return false; //Knights can't be impeded
    }
    
    
    public boolean testMove(Board b, int num, int letter) { //Moves in a L fashion, 1 square vertically, 2 squares horizontally
        Location l = b.getLocAt(num,letter);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
        
           
    }
}
