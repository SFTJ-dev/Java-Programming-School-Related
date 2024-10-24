public class Bicycle extends Vehicle{

	@Override
    public void go() {
        System.out.println("The " + this.getBrand() + " " + this.getColor() + " bicycle worth " + this.getPrice() + " is moving!!!");
    }

    //stop method
    public void stop() {
        System.out.println("The bicycle is stopped");
    }

}
