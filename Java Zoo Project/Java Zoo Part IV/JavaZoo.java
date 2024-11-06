// JavaZoo class
public class JavaZoo {
    private String zooName = "Java Park n Zoo";

    public String getZooName() {
        return zooName;
    }

    public static void main(String[] args) {
        // Create objects

        ZooAnimal pecanzo = new ZooAnimal("Pecanzo", "Elephant", 5, true);
        ZooKeeper keeper = new ZooKeeper("Jesper Reed", "Head Keeper", 20.0, true);
        Cage cage = new Cage(10, 10, 10, true, true);
		
		ZooAnimal animal1 = new ZooAnimal("Zee", "Monkey", 2);
        ZooAnimal animal2 = new ZooAnimal("Chip", "Monkey", 5);
        Dolphin dolphin1 = new Dolphin("Flipper", "Dolphin", 8, "Jumping through hoops");
		Dolphin dolphin2 = new Dolphin("Freddy", "Dolphin", 8, "flip");
        
		

        // Display information and invoke behaviors
        System.out.println("Animals in the zoo:");
		cage.border(40);
		System.out.println(" ");

        // Print each animal's information and behaviors
        animal1.eat("zooFood");
        animal1.sleep();

		cage.border(40);
		System.out.println(" ");

        animal2.eat("zooFood");
        animal2.sleep();
		
		cage.border(40);
		System.out.println(" ");

        dolphin1.eat("zooFish");
        dolphin1.performTrick();
        dolphin1.sleep();
		
		cage.border(40);
		System.out.println(" ");		
		
		dolphin2.eat("mackerel");
		dolphin2.performTrick();
		
		cage.border(40);
		System.out.println(" ");

        // Set the animal in the cage
        cage.setAnimal(pecanzo);

        // Display cage information
        cage.displayInfo("Pecanzo", "Elephant");

        // ZooKeeper feeds the animal
        keeper.feedAnimal(pecanzo, "peanuts");
		
		cage.border(40);
		System.out.println(" ");

        // Pay ZooKeeper for hours worked
        System.out.println("Payment to ZooKeeper: $" + keeper.payMe(8));
		
		// Print the total number of animals in the zoo using animalCounter
        System.out.println("There are " + ZooAnimal.getAnimalCounter() + " animals in the JavaZoo.");

    } //end of main method
	
} //end of the JavaZoo2 class