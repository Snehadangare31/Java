// GitHub Example Java Code
// This code demonstrates a simple program to calculate the factorial of a number.

public class FactorialCalculator {
    // Method to calculate factorial
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5; // Example input
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
