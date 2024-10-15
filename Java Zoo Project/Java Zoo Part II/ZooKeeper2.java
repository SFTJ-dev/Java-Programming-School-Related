public class ZooKeeper2{ //start of the ZooKeeper2 class
	private String name;
	private String title;
	private double payrate;
	private boolean degree;
	
	//overloaded constructor for efficiency
	//input all of the parameters inside the close and open parenthesis
	public ZooKeeper2(String name, String title, double payrate, boolean degree){
		this.name = name;
		this.title = title;
		this.payrate = payrate;
		this.degree = degree;
	}
	
	//getters
	//if we already have the overloaded constructor
	//then there is no need to set each parameters individually
	
	public String getName(){
		return name;
	}
	public String getTitle(){
		return title;
	}
	public double getPayrate(){
		return payrate;
	}
	public boolean hasDegree(){
		return degree;
	} // end of the getters
} // end of the ZooKeeper2 class
