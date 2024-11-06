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
	
    @Override
    public void eat(String food) {
        isHungry = false;
        if (food.equals("mackerel")) {
            System.out.println(name + " is eating mackerel...");
        } else {
            System.out.println("Dolphins eat lots of fish");
            System.out.println(name + " is eating " + food + "...");
        }
    }

}//end of the class