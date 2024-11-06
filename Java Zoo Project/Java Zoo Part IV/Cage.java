public class Cage{ //start of the cage class
	private int length;
	private int width;
	private int height;
	private boolean clean;
	private boolean covered;
	private ZooAnimal animal;
	
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
	
	//added source code
	public void setAnimal(ZooAnimal animal){
		this.animal = animal;
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
	
	public void displayInfo(String name, String type){
		System.out.println("The cage has an " + animal.getType() +" named " + animal.getName());
	}
	
	public static void border(int num){
		for(int x = 1; x<=num; x++){
			System.out.print("^");
		}//end of for loop
	}//end of border
} //end of the cage class