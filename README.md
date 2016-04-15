# chessclone  

# TODO:  
testMove() methods of Pawn, Knight, Bishop, Rook, Queen, King classes. This method will check if the move inputed is a valid move.
Utilize the Location and Piece objects I have provided in the skeletons of the methods. getNum() and getLetter() are implemented in both Location and Piece, and getLocAt() will get the Location object at the given coordinates. Location.procCoords() returns the String notation of what the notation is (letter)(number).The double array coordinate system is(letter)(number)(letter), with 0-7 being the direction of white on the "number" axis which will graphically be the y axis, and 7-0 the direction of black on the "letter" axis which will graphically be the x axis. 

UPDATE: King's, Pawn's, Knight's, Bishop's, and Queen's testMove methods are done, and I have added an abstract impededCheck method to the Piece class. The testMove method should utilize this method as a helper method to check if the path to the move is clear, if not, it will return false.  

List of Piece Classes that need to have these methods implemented:  

Rook: A rook moves horizontally both ways.  

Please note that the instance of Check will be tested seprately, so you do not need to worry about that. You only need to test on whether the piece can reach its destination without impedence. 

Also, we need to decide when we are doing our "open lab" time.

# List of possible open lab times:  

KD - I'll be able to be here for all of the other 3 open lab days, but not 4/15(today).
