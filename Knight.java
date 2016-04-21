
public class Knight {

    public Knight(Color color,Coordinate coord) {
        super(color,coord);
    }
    
    public boolean impededCheck(Board board, Coordinate coord) {
        return false; //Knights can't be impeded
    }
    
    
    public boolean testMove(Board b, Coordinate coord) { //Moves in a L fashion, 1 square vertically, 2 squares horizontally
        Location l = b.getLocAt(coord);
        Piece p = l.getPiece();
        if (!super.notSameColor(p))
           return false;
        int numTest = Math.abs(super.getNum()-num);
        int letterTest = Math.abs(super.getLetter()-letter);
        return (((numTest == 1) && (letterTest == 2)) || ((numTest == 2) && (letterTest == 1))); 
    }
}
