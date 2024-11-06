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
	
	//start of eat method
	public void eat(){
		System.out.println("The ZooAnimal named " + name + " is eating!");
	}
	
	//start of sleep method
	public void sleep(){
		System.out.println("The ZooAnimal named " + name + " is sleeping!");
	}
	
	//toString
	public String toString(){
		return "The name of the animal is " + name + "\nThe type of the animal is " + type + 
		"\nThe age of the animal is " + age + "\nIs the animal hungry? " + hungry;
	}//end of toString
	
} //end of the class