import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CompoundInterestProgram {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CompoundInterestResult.txt", true))) {
            System.out.print("Enter the principal amount: ");
            calculator.setPrincipal(scanner.nextDouble());

            System.out.print("Enter the interest rate (in %): ");
            calculator.setRate(scanner.nextDouble() / 100);

            System.out.print("Enter the number of times compounded per year: ");
            calculator.setTimeCompounded(scanner.nextInt());

            System.out.print("Enter the number of years: ");
            calculator.setYears(scanner.nextInt());

            double amount = calculator.computeCompoundInterest();

            System.out.printf("The amount after %d years is: %.2f%n", calculator.getYears(), amount);

            writer.write("Compound Interest Calculation Result:\n");
            writer.write("-------------------------------\n");
            writer.write("Principal Amount: " + calculator.getPrincipal() + "\n");
            writer.write("Interest Rate: " + calculator.getRate() * 100 + "%\n");
            writer.write("Times Compounded per Year: " + calculator.getTimeCompounded() + "\n");
            writer.write("Number of Years: " + calculator.getYears() + "\n");
            writer.write("Amount after " + calculator.getYears() + " years: " + String.format("%.2f", amount) + "\n");
            writer.write("-------------------------------\n");
            write.newLine();
            writer.flush();

            System.out.println("Result saved to CompoundInterestResult.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        scanner.close();
    }
}
