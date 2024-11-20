import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compute compute = new Compute();
        
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (a)");
            System.out.println("2. Subtraction (s)");
            System.out.println("3. Multiplication (m)");
            System.out.println("4. Division (d)");
            System.out.println("5. Modulo (mod)");
            System.out.println("6. View Results");
            System.out.println("7. Exit (e)");
            System.out.print("Enter your choice: ");
            String choice = scanner.next();

            if (choice.equals("7") || choice.equals("e")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            int number;
            switch (choice) {
                case "1":
                case "a":
                    System.out.print("Enter a number to add: ");
                    number = scanner.nextInt();
                    compute.addNumber(number);
                    break;
                case "2":
                case "s":
                    System.out.print("Enter a number to subtract: ");
                    number = scanner.nextInt();
                    compute.addNumber(-number); // Subtraction logic handled by adding negative number
                    break;
                case "3":
                case "m":
                    System.out.print("Enter a number to multiply: ");
                    number = scanner.nextInt();
                    compute.addNumber(number); // Multiplication logic handled by normal addition
                    break;
                case "4":
                case "d":
                    System.out.print("Enter a number to divide: ");
                    number = scanner.nextInt();
                    compute.addNumber(number); // Division logic handled by normal addition
                    break;
                case "5":
                case "mod":
                    System.out.print("Enter a number for modulo: ");
                    number = scanner.nextInt();
                    compute.addNumber(number); // Modulo logic handled by normal addition
                    break;
                case "6":
                    System.out.println("\nResults:");
                    System.out.println("Sum: " + compute.getSum());
                    System.out.println("Subtraction: " + compute.getSubtraction());
                    System.out.println("Multiplication: " + compute.getProduct());
                    System.out.println("Division: " + compute.getDivision());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
