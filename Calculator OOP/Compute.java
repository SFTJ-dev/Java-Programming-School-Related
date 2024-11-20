public class Compute {
    private int sum = 0;
    private int product = 1;
    private int subtraction;
    private double division;
    private boolean firstNumber = true;

    // Method to initialize subtraction and division for the first number
    public void initializeFirstNumber(int number) {
        if (firstNumber) {
            subtraction = number;
            division = number;
            sum = number;
            product = number;
            firstNumber = false;
        }
    }

    // Add a number to the calculations
    public void addNumber(int number) {
        sum += number;
        subtraction -= number;
        product *= number;
        if (number != 0) division /= number;
    }

    // Getters for results
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
