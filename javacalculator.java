import java.util.Scanner;

public class javacalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Operator ( +, -, *, / ): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        if (operator == '+') {
            printResult(num1 + num2);
        } else if (operator == '-') {
            printResult(num1 - num2);
        } else if (operator == '*') {
            printResult(num1 * num2);
        } else if (operator == '/') {
            if (num2 != 0) {
                printResult(num1 / num2);
            } else {
                System.out.println("Error: Cannot Divide by zero.");
                return;
            }

        } else {
            System.out.println("Error: Invalid Operator.");
            return;
        }
    }

    public static void printResult(double result) {
        if (result == (int) result) {
            System.out.println("Result: " + (int) result);
        } else {
            System.out.println("Result: " + result);
        }
    }
}