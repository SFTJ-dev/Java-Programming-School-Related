// JavaZoo class
public class JavaZoo {
    private String zooName = "Java Park n Zoo";

    public String getZooName() {
        return zooName;
    }

    public static void main(String[] args) {
        // Create objects
        ZooAnimal myFirstAnimal = new ZooAnimal("Zee", "Monkey", 2, true);
        Cage myFirstCage = new Cage(10, 12, true, false);
        ZooKeeper myFirstZooKeeper = new ZooKeeper("John Doe", "Janitor", 5000.00, true);
        
        
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
        System.out.println("ZooKeeper PayRate: " + myFirstZooKeeper.getPayRate());
        System.out.println("Has a Degree? " + myFirstZooKeeper.hasDegree());

        // Print the name of the Zoo
        JavaZoo javaZoo = new JavaZoo();
        System.out.println("Zoo Name: " + javaZoo.getZooName());
    }
}
