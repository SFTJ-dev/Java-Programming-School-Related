import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class TryAndCatch {
 
    public static void main(String[] args) {
 
        Scanner cuteScanner = new Scanner(System.in);
        Scanner cuteScanner1 = new Scanner(System.in);
		Scanner cuteScanner2 = new Scanner(System.in);
 
        try {
            System.out.print("Enter a number: ");
            int num = cuteScanner.nextInt();
            System.out.print("Enter another number: ");
            int num1 = cuteScanner1.nextInt();
 
            int sum = num + num1;
            System.out.println("The sum of " + num + " and " + num1 + " is " + sum);
 
			System.out.println(" ");
 
 
			System.out.println("Enter a number for Array: ");
            int[] myNumbers = {1, 2, 3}; 
			int numscan = cuteScanner2.nextInt();
            System.out.println("Result: "+ myNumbers[numscan]);
 
            if (num <= 0) {
                throw new Exception("Null or Negative number is invalid.");
            }
        } catch (InputMismatchException e) {
            System.out.print("Invalid input. Please enter a valid number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The try and catch is finished.");
        }
 
    }
}
