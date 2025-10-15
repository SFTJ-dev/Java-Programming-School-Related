
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employee = new Employee[5];
		//create am array of department
		employee[0] = new Employee("Sofia", 2443, Department.Accounting, 6, 250);
		employee[1] = new Employee("Hera",4574, Department.Manufacturing, 8, 100);
		employee[2] = new Employee("Sera",3462, Department.HR, 8, 300);
		employee[3] = new Employee("Chera" , 1234, Department.Purchasing, 9, 150);
		employee[4] = new Employee("Cherry" , 4566, Department.Accounting, 4, 1000);
		
		
		for(int i=0; i<=employee.length-1; i++) {
			System.out.println("Employee " + (i+1) + " Details:" + "\n" + employee[i] + "\n");
		}

	}//end of main

}//end of main class
