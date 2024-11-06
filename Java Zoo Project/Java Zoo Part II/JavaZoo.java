// JavaZoo class
public class JavaZoo{

    public static void getZooName(String zoo) {
        System.out.println(zoo);
    }

    public static void main(String[] args) {
        // Create objects
        ZooAnimal myFirstAnimal = new ZooAnimal("Chip", "Monkey", 5, false);
        Cage myFirstCage = new Cage(15, 20, 15, false, true);
        ZooKeeper myFirstZooKeeper = new ZooKeeper("Mr. Johnson Rock", "Manager", 15.00, false);
		
		 // Print the name of the Zoo
        getZooName("Java Park 'n' Zoo");
		
		//display border zoo
		myFirstCage.border(20);
        
		//display toString animal
		System.out.println(" ");
		System.out.println(myFirstAnimal.toString());
		
		//display border animal
		myFirstCage.border(20);
        
		//display toString cage
		System.out.println(" ");
		System.out.println(myFirstCage.toString());
		
		//display border cage
		myFirstCage.border(40);
		
		//invoke all of the methods
		System.out.println(" ");
		myFirstZooKeeper.feedAnimal();
		myFirstZooKeeper.cleanCage();
		myFirstAnimal.eat();
		myFirstAnimal.sleep();

    } //end of main method
	
} //end of the JavaZoo2 class