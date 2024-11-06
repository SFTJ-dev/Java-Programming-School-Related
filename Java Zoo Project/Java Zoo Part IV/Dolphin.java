public class Dolphin extends ZooAnimal{
	
	private String trick;
	
	
	//constructor
	public Dolphin(String name, String type, int age, String trick){
		super(name, type, age);  // Call the superclass constructor
        this.trick = trick;
	}
	
	//the trick
	public void performTrick() {
        System.out.println(getName() + " the " + getType() + " performs a trick: " + trick);
    }

}//end of the class