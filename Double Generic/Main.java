
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleGeneric<String,String> p1 = new DoubleGeneric<String,String>("Hello my name is " , "Sofia N. Tabujara"); 
		System.out.println("String, String: " + p1.getKey() + p1.getValue());

		DoubleGeneric<Integer,Integer> p2 = new DoubleGeneric<Integer,Integer>(50 , 30); 
		System.out.println("Key (Integer): " + p2.getKey());
		System.out.println("Value (Integer): " + p2.getValue());
		
		DoubleGeneric<Double,Double> p3 = new DoubleGeneric<Double,Double>(50.00 , 30.00); 
	}

}
