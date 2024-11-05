public class ZooAnimal{ //start of the class
	private String name;
	private String type;
	private int age;
	private boolean hungry;
	
	//overloaded constructor
	//doesn't need to add setters, just proceed adding getters and you're good to go
	public ZooAnimal(String name, String type, int age, boolean hungry){
		this.name = name;
		this.type = type;
		this.age = age;
		this.hungry =  hungry;
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
		return hungry;
	} // end of the getters
	
	// Method overloading for eat
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    // Method overloading for sleep
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void sleep(int hours) {
        System.out.println(name + " has slept for " + hours + " hours.");
	}//end of sleep
	
} //end of the class 
