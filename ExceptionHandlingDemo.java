import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for input
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();

            // Call divide method that may throw an exception
            int result = divide(numerator, denominator);

            // Display result if no exception occurred
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Final message after execution
            System.out.println("Program execution completed.");
        }
    }

    // Method that performs division and may throw an ArithmeticException
    public static int divide(int numerator, int denominator) {
        return numerator / denominator; // Throws ArithmeticException if denominator is zero
    }
}
