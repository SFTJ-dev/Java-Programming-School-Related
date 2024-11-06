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
		
		ZooAnimal animal1 = new ZooAnimal("Leo", "Lion", 5);
        ZooAnimal animal2 = new ZooAnimal("Ellie", "Elephant", 10);
        Dolphin dolphin1 = new Dolphin("Flipper", "Dolphin", 8, "Jumping through hoops");
		

        // Display information and invoke behaviors
        System.out.println("Animals in the zoo:");

        // Print each animal's information and behaviors
        animal1.eat();
        animal1.sleep();

        animal2.eat();
        animal2.sleep();

        dolphin1.eat();
        dolphin1.performTrick();
        dolphin1.sleep();

        // Print the total number of animals in the zoo using animalCounter
        System.out.println("There are " + ZooAnimal.getAnimalCounter() + " animals in the JavaZoo.");

        // Set the animal in the cage
        cage.setAnimal(pecanzo);

        // Display cage information
        cage.displayInfo("Pecanzo", "Elephant");

        // ZooKeeper feeds the animal
        keeper.feedAnimal(pecanzo, "peanuts");

        // Pay ZooKeeper for hours worked
        System.out.println("Payment to ZooKeeper: $" + keeper.payMe(8));

    } //end of main method
	
} //end of the JavaZoo2 class