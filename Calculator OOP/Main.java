import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compute compute = new Compute();

        System.out.println("Choose an operation to perform on numbers:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int operation = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();
        compute.initializeFirstNumber(number);

        while (true) {
            System.out.print("Enter another number (or 0 to stop): ");
            number = scanner.nextInt();

            if (number == 0) break;

            compute.addNumber(number);
        }

        System.out.println("\nResults:");
        switch (operation) {
            case 1:
                System.out.println("Sum: " + compute.getSum());
                break;
            case 2:
                System.out.println("Subtraction: " + compute.getSubtraction());
                break;
            case 3:
                System.out.println("Multiplication: " + compute.getProduct());
                break;
            case 4:
                System.out.println("Division: " + compute.getDivision());
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
