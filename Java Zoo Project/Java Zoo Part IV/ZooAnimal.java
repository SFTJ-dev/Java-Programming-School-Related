public class ZooAnimal{ //start of the class
	protected String name;
	protected String type;
	protected int age;
	protected boolean isHungry;
	
	//lets put the animal counter here
	protected static int animalCounter = 0;
	
	
	//overloaded constructor
	//doesn't need to add setters, just proceed adding getters and you're good to go
	public ZooAnimal(String name, String type, int age, boolean hungry){
		this.name = name;
		this.type = type;
		this.age = age;
		this.isHungry =  isHungry;
		animalCounter++;  // Increment animal counter every time a ZooAnimal is created
	}
	
	//add another overloaded constructor
	public ZooAnimal(String name, String type, int age) {
        this(name, type, age, false);
    }
	
	//getters
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public int getAge(){
		return age;
	}
	public boolean isHungry(){
		return isHungry;
	} // end of the getters
	
	public static int getAnimalCounter() {
        return animalCounter;
    }
	
	
	// Method overloading for eat
    public void eat() {
		if(isHungry){
			System.out.println(name + " is eating.");
		}else{
			System.out.println(name + " is not eating.");
		}
    }

    public void eat(String food) {
		if(isHungry){
			System.out.println(name + " is eating " + food + ".");
		}else{
			System.out.println(name + " is eating " + food + ".");
		}
    }

    // Method overloading for sleep
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void sleep(int hours) {
        System.out.println(name + " has slept for " + hours + " hours.");
	}//end of sleep
	
} //end of the class 