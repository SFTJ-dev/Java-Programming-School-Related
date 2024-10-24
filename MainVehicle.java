public class MainVehicle{
	public static void main(String[] args){
		
		Car car = new Car();
		car.setBrand("Nissan");
		car.setColor("hot pink");
		car.setYear(2024);
		car.setPrice(10000000.00);
		
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Color: " + car.getColor());
		System.out.println("Year: " + car.getYear());
		System.out.println("Price: " + car.getPrice());

		car.go();
		car.stop();
		System.out.println(" ");

		
		Bicycle bicycle = new Bicycle();
		bicycle.setBrand("Monteu");
		bicycle.setColor("ash grey");
		bicycle.setYear(2024);
		bicycle.setPrice(1000.00);
		
		System.out.println("Brand: " + bicycle.getBrand());
		System.out.println("Color: " + bicycle.getColor());
		System.out.println("Year: " + bicycle.getYear());
		System.out.println("Price: " + bicycle.getPrice());
		
		bicycle.go();
		bicycle.stop();
		
	}
}