public class Vehicle{
	
    //attributes , properties
    private String brand;
    private String color;
    private int year;
    private double price;

    // null constructor
    public Vehicle() {
    }

    //overloaded constructor
    public Vehicle(String brand, String color, int year, double price) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    //setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPrice(double price) {
		this.price = price;
	}


    //getter
    public String getBrand() {
        return brand;
    }
	public String getColor() {
		return color;
	}
	public int getYear() {
		return year = year;
	}
	public double getPrice() {
		return price;
	}

    //go method
    public void go() {
        System.out.println("The vehicle is moving!!!");
    }

    //stop method
    public void stop() {
        System.out.println("The vehicle is stopped");
    }
}