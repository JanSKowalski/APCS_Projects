public class Board{
       private ArrayList<Tile> _gameBoard; // concentration board of Tiles
       private int _size;   // number of Tiles on board
       private int _rowLength; // number of Tiles printed in a row
       private int _numberOfTilesFaceUp; // number of Tiles face-up
       private FooSet _possibleTileValues; // possible Tile images

       // Constructs n by n concentration board of Tiles whose values
       // are chosen from the already filled FooSet foos.
       // Precondition: n is the length of a side of the board.
       // n is an even positive integer.
       // FooSet contains at least n * n / 2 strings.
       public Board(int n, FooSet foos){
		_size = n*n;
		_gameBoard = new ArrayList<List>();
		_rowLength = n;
		_numberOfTilesFaceUp = 0;
		_possibleTileValues = foos;
		fillBoard();
		for(Tile x : _gameBoard){
			x.turnFaceDown();
		}
	}


       // Randomly fils this concentration board with tiles. The number
       // of distinct tiles used on the board is size / 2.
       // Any one tile image appears exactly twice.
       // Precondition: number of positions on board is even.
       // possibleTileValues contains at least size / 2 elements.
       private void fillBoard(){
	for (int i = 0; i < _size; i += 2){
		String foo = _possibleTileValue.removeRandomFoo();
		_gameBoard.add(new Tile(foo));
		_gameBoard.add(new Tile(foo));
	}
	shuffle(_gameBoard);
	}

	private void shuffle (List <Tile> L){
		for (int i = 0; i < _size; i ++){
			int r = (int) (Math.random()*L.size() - i) + i;
			L.set(i, L.set(r, L.get(i)));
		}
	}

       //Precondition: Tile in position p is face-down.
       //Postcondition: Tile in postion p is face-up.
       public void lookAtTile(int p){
		_gameBoard.get(p).turnFaceUp();
		_gameBoard.get(p) = _gameBoard.get(p).showFace();
		_numberOfTilesFaceUp++;
		}

       //Checks whether the Tile in pos1 and pos2 have the same image.
       // If they do, the Tiles are turned face-up. If not, the Tileas
       // are turned face-down.
       // Precondition: _gameBoard[pos1] is face-up.
       // _gameBoard[pos2] is face-up.
       public void checkMatch(int pos1, int pos2){
		if (_gameBoard.get(pos1)}

       // Board is printed for the player. If the Tile is turned face-up,
       // the image is printed. If the Tile is turned face-down,
       // the Tile position is printed.
       public void printBoard(){
		for (Tile x : _gameBoard)}

       // Returns Tile in postion pos.
       public Tile pickTile(int pos){
		return _gameBoard[p];
	}

       // Returns right-justified number with p places as a string.	
       public String format(String word, int p){

	}

       // Returns true if all Tiles are turned face-up, false otherwise.
       public boolean allTiles(){
		return (_size == _numberOfTilesFaceUp);
		
	}


}