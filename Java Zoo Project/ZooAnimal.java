// ZooAnimal class
public class ZooAnimal {
    private String name;
    private String type;
    private int age;
    private boolean hungry;

    public ZooAnimal(String name, String type, int age, boolean hungry) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungry = hungry;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
