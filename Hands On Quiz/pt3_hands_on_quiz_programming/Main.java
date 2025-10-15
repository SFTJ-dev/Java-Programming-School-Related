
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		student.inputStudentInfo(scanner);
		
		System.out.println("Select options:");
		System.out.println("[1] Core");
		System.out.println("[2] Specialized");
		System.out.println("[3] Others");
		System.out.println("[4] Exit");
		
		System.out.print("Enter your choice: ");
		int option = scanner.nextInt();
		
		if(option >= 1 && option <= 3) {
			student.computeGrade(option);
			System.out.println(student.toString());
		}else if(option == 4){
			System.out.println("Exiting...");
		}else {
			System.out.println("Invalid option. Exiting...");
		}
		scanner.close();
	}

}
