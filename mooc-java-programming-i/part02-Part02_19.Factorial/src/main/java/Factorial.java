import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        int factorial = calculateFactorial(number);

        // Print the result
        System.out.println("Factorial: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the factorial
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1; // By definition, 0! is 1
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
