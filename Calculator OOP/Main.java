import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compute compute = new Compute();

        System.out.println("Enter numbers (or 0 to stop):");
        int number;

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) break;

            compute.addNumber(number);
        }

        System.out.println("\nResults:");
        System.out.println("Sum: " + compute.getSum());
        System.out.println("Subtraction: " + compute.getSubtraction());
        System.out.println("Multiplication: " + compute.getProduct());
        System.out.println("Division: " + compute.getDivision());

        scanner.close();
    }
          }
