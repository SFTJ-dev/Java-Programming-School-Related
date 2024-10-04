// ZooKeeper class
public class ZooKeeper {
    private String name;
    private double payRate;
    private boolean degree;

    public ZooKeeper(String name, double payRate, boolean degree) {
        this.name = name;
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
