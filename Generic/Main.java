
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Create a GenericStringPrinter for String
		GenericStringPrinter<String>stringPrinter = new GenericStringPrinter<>("Hello, World");
		stringPrinter.print();
		
		//Create a GenericStringPrinter for Integer
		GenericStringPrinter<Integer>intPrinter = new GenericStringPrinter<>(123);
		intPrinter.print();
		
		//Create a GenericStringPrinter for Double
		GenericStringPrinter<Double>doublePrinter = new GenericStringPrinter<>(16.9);
		doublePrinter.print();
		
		//Create a GenericStringPrinter for Boolean	
		GenericStringPrinter<Boolean>booleanPrinter = new GenericStringPrinter<>(true);
		booleanPrinter.print();
		
		//Create a GenericStringPrinter for Byte	
		GenericStringPrinter<Byte>bytePrinter = new GenericStringPrinter<Byte>((byte) 60);
		bytePrinter.print();
		
		//Create a GenericStringPrinter for Float
		GenericStringPrinter<Float>floatPrinter = new GenericStringPrinter<Float>((float) 572352522);
		floatPrinter.print();
		
		//Create a GenericStringPrinter for Long	
		GenericStringPrinter<Long>longPrinter = new GenericStringPrinter<Long>((long) 432345575);
		longPrinter.print();
		
		//Create a GenericStringPrinter for Byte	
		GenericStringPrinter<Short>shortPrinter = new GenericStringPrinter<Short>((short) 35626464);
		shortPrinter.print();
		
	}

}
