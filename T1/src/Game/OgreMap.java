package Game;

public class OgreMap implements GameMap, Cloneable {
	public OgreMap(){};
	private char[][] matrix={
			{'X','X','X','X','X','X','X','X','X'},
			{'I',' ',' ',' ',' ',' ',' ','k','X'},
			{'X',' ',' ',' ',' ',' ',' ',' ','X'},
			{'X',' ',' ',' ',' ',' ',' ',' ','X'},
			{'X',' ',' ',' ',' ',' ',' ',' ','X'},
			{'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
			{'X', ' ', ' ', ' ', ' ', ' ',' ',' ', 'X'},
			{'X', ' ', ' ', ' ', ' ', ' ',' ',' ','X'},
			{'X', 'X', 'X', 'X', 'X', 'X','X','X','X'},
		};

	@Override public OgreMap clone() {
	    try {
	        final OgreMap result = (OgreMap) super.clone();
	        // copy fields that need to be copied here!
	        return result;
	    } catch (final CloneNotSupportedException ex) {
	        throw new AssertionError();
	    }
	}
	
	@Override

	public char[][] getMap() {
		return this.matrix;
	}

	@Override
	public GameMap nextMap() {
		return null;
	}

	@Override
	public boolean moveTo(int x, int y) {
		if(this.matrix[x][y] == ' ')	
			return true;
		else if(this.matrix[x][y] == 'k')
			return true;
		else if(this.matrix[x][y] == 'S')
			return true;
		
		return false;
	}

}
