public class Cage{ //start of the cage class
	private int length;
	private int width;
	private int height;
	private boolean clean;
	private boolean covered;
	
	//overloaded constructor
	//input all the parameters inside the()
	//insert the values after
	public Cage(int length, int width, int height, boolean isClean, boolean isCovered){
		this.length = length;
		this.width = width;
		this.height = height;
		this.clean = clean;
		this.covered = covered;
	}
	
	//place the getters below
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public boolean isClean(){
		return clean;
	}
	public boolean isCovered(){
		return covered;
	} //end of getters
} //end of the cage class