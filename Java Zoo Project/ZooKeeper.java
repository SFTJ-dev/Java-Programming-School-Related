public class ZooKeeper{ //start of the ZooKeeper2 class
	private String name;
	private String title;
	private double payrate;
	private boolean degree;
	
	//overloaded constructor for efficiency
	//input all of the parameters inside the close and open parenthesis
	public ZooKeeper(String name, String title, double payrate, boolean degree){
		this.name = name;
		this.title = title;
		this.payrate = payrate;
		this.degree = degree;
	}
	
	//getters
	//if we already have the overloaded constructor
	//then there is no need to set each parameters individually
	
	public String getName(){
		return name;
	}
	public String getTitle(){
		return title;
	}
	public double getPayrate(){
		return payrate;
	}
	public boolean hasDegree(){
		return degree;
	} // end of the getters
	
	// Method to feed an animal
    public void feedAnimal(ZooAnimal animal, String food) {
        System.out.println(name + " is feeding " + animal.getName() + " " + food + ".");
        animal.eat(food);
    }
	
	// Method to clean the cage
    public void cleanCage() {
        System.out.println(name + " is cleaning the cage.");
    }

    // Method to calculate payment
    public double payMe(int hours) {
        return payrate * hours;
    }

	
} // end of the ZooKeeper2 class