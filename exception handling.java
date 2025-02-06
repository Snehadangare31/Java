// Custom Exception for Too Long Addition
class TooLongAdditionException extends Exception {
    public TooLongAdditionException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Subtraction
class NegativeAnswerException extends Exception {
    public NegativeAnswerException(String message) {
        super(message);
    }
}

// Custom Exception for Too Long Multiplication
class TooLongMultiplicationException extends Exception {
    public TooLongMultiplicationException(String message) {
        super(message);
    }
}

// Main class with two integer data members
class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to add two numbers
    public int add() throws TooLongAdditionException {
        int result = num1 + num2;
        if (result > 1000) {
            throw new TooLongAdditionException("Addition result too long: " + result);
        }
        return result;
    }

    // Method to subtract two numbers
    public int subtract() throws NegativeAnswerException {
        int result = num1 - num2;
        if (result < 0) {
            throw new NegativeAnswerException("Negative result: " + result);
        }
        return result;
    }

    // Method to multiply two numbers
    public int multiply() throws TooLongMultiplicationException {
        int result = num1 * num2;
        if (result > 5000) {
            throw new TooLongMultiplicationException("Multiplication result too long: " + result);
        }
        return result;
    }

    // Method to divide two numbers
    public double divide() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) num1 / num2;
    }
}

// Testing the Calculator class
public class Exceptionhandling {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator(500, 600);
            
            // Test addition
            System.out.println("Addition: " + calc.add());
            
            // Test subtraction
            System.out.println("Subtraction: " + calc.subtract());
            
            // Test multiplication
            System.out.println("Multiplication: " + calc.multiply());
            
            // Test division
            System.out.println("Division: " + calc.divide());
        } catch (TooLongAdditionException | NegativeAnswerException | TooLongMultiplicationException | ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}