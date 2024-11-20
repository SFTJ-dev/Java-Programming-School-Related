public class Compute {
    private int sum = 0;
    private int product = 1;
    private int subtraction;
    private double division;
    private boolean firstNumber = true;

    // Method to add a number to the calculations
    public void addNumber(int number) {
        if (number == 0) return;

        // Initialize subtraction and division with the first number
        if (firstNumber) {
            subtraction = number;
            division = number;
            firstNumber = false;
        } else {
            subtraction -= number;
            if (number != 0) division /= number;
        }

        sum += number;
        product *= number;
    }

    public int getSum() {
        return sum;
    }

    public int getProduct() {
        return product;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public double getDivision() {
        return division;
    }
}
