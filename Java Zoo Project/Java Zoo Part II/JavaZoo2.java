// JavaZoo class
public class JavaZoo2 {
    private String zooName = "Java Park n Zoo";

    public String getZooName() {
        return zooName;
    }

    public static void main(String[] args) {
        // Create objects
        ZooAnimal2 myFirstAnimal = new ZooAnimal2("Leo", "Mammals", 16, true);
        Cage2 myFirstCage = new Cage2(60, 10, 80, true, false);
        ZooKeeper2 myFirstZooKeeper = new ZooKeeper2("Jonathan", "Manager", 5000000.00, true);
		
		
		myFirstAnimal.coteBorder();
		System.out.println(" ");

		
		 // Print the name of the Zoo
        JavaZoo2 javaZoo = new JavaZoo2();
        System.out.println("Zoo Name: " + javaZoo.getZooName());
        
		
		myFirstAnimal.coquetteBorder();
		System.out.println(" ");
		System.out.println(myFirstAnimal.toString());
		myFirstAnimal.coquetteBorder();
		

        
		/*
        // Print details of ZooAnimal
        System.out.println("Animal Name: " + myFirstAnimal.getName());
        System.out.println("Animal Type: " + myFirstAnimal.getType());
        System.out.println("Animal Age: " + myFirstAnimal.getAge());
        System.out.println("Is Animal Hungry? " + myFirstAnimal.isHungry());

        // Print details of Cage
        System.out.println("Cage Length: " + myFirstCage.getLength());
        System.out.println("Cage Width: " + myFirstCage.getWidth());
        System.out.println("Is Cage Clean? " + myFirstCage.isClean());
        System.out.println("Is Cage Covered? " + myFirstCage.isCovered());

        // Print details of ZooKeeper
        System.out.println("ZooKeeper Name: " + myFirstZooKeeper.getName());
        System.out.println("ZooKeeper Title: " + myFirstZooKeeper.getTitle());
        System.out.println("ZooKeeper PayRate: " + myFirstZooKeeper.getPayrate());
        System.out.println("Has a Degree? " + myFirstZooKeeper.hasDegree());
		*/

    } //end of main method
	
} //end of the JavaZoo2 class
