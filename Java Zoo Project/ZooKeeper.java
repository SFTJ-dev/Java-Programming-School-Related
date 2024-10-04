// ZooKeeper class
public class ZooKeeper {
    private String name;
    private String title;
    private double payRate;
    private boolean degree;

    public ZooKeeper(String name, String title, double payRate, boolean degree) {
        this.name = name;
        this.title = title;
        this.payRate = payRate;
        this.degree = degree;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public boolean hasDegree() {
        return degree;
    }

    public void setDegree(boolean degree) {
        this.degree = degree;
    }
}
