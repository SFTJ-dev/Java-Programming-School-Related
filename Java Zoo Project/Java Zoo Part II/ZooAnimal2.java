public class ZooAnimal2{ //start of the class
	private String name;
	private String type;
	private int age;
	private boolean hungry;
	
	//overloaded constructor
	//doesn't need to add setters, just proceed adding getters and you're good to go
	public ZooAnimal2(String name, String type, int age, boolean hungry){
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
	
	//start of toString method
	public String toString(){
		return "The name of the animal is " + name + "\n" +
				"The type of the animal is " + type + "\n" +
				"The age of the animal is " + age + "\n" +
				"Is the animal hungry? " + hungry;
	} //end of toString method
	
	public static void coquetteBorder(){
		
		for(int c = 1; c<=23; c++){
		System.out.print("^");
		}
	} //end of static
	
	public static void coteBorder(){
		
		for(int t = 1; t<=23; t++){
		System.out.print("^");
		}
	} //end of static
	
} //end of the class
