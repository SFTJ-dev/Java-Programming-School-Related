public class  Car extends Vehicle{
	
	@Override
    public void go() {
        System.out.println("The " + this.getBrand() + " " + this.getColor() + " car worth " + this.getPrice() + " is moving!!!");
    }

    //stop method
    public void stop() {
        System.out.println("The vehicle is stopped");
    }

}
