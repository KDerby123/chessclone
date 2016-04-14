# chessclone  

# UPDATE:  
TODO: testMove() methods of Pawn, Knight, Bishop, Rook, Queen, King classes. This method will check if the move inputed is a valid move.
Utilize the Location and Piece objects I have provided in the skeletons of the methods. getNum() and getLetter() are implemented in both Location and Piece, and getLocAt() will get the Location object at the given coordinates.

UPDATE: King and Pawn's testMove methods are done, and I have added an abstract impededCheck method to the Piece class. This method should be used in conjunction with the testMove method and should check if the path to the move is clear, if not, it will return false.  

List of Piece Classes that need to have these methods implemented:  

Knight (testMove only): A knight moves two squares horizontally and one square vertically, or two squares vertically and one square horizontally.  

Bishop: A bishop moves diagonally both ways.  

Rook: A rook moves horizontally both ways.  

Queen: A queen moves diagonally both ways and horizontally both ways.

Please note that the instance of Check will be tested seprately, so you do not need to worry about that. You only need to test on whether the piece can reach its destination without impedence. 
