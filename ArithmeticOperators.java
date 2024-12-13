import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Avoid division by zero
        double modulus = num2 != 0 ? num1 % num2 : Double.NaN; // Avoid modulus by zero

        // Display results
        System.out.println("Results of Arithmetic Operations:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + (num2 != 0 ? division : "Undefined (Division by zero)"));
        System.out.println("Modulus: " + (num2 != 0 ? modulus : "Undefined (Division by zero)"));

        scanner.close();
    }
}