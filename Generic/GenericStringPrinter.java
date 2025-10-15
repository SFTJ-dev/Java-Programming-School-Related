
public class GenericStringPrinter<T> {
	private T value;
	
	//constructor
	public GenericStringPrinter(T value) {
		this.value = value;
	}
	
	//print method
	public void print() {
		System.out.println(value.toString());
	}

}
