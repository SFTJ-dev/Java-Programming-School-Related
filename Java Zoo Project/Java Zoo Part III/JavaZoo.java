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