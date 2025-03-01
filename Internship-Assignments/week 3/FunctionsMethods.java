//Program Statement: Write a program to calculate the factorial of a number using a method.

public class FunctionsMethods {
    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number); 
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

// Output
// Factorial of 5 is: 120