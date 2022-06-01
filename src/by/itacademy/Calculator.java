package by.itacademy;

import java.util.Scanner;

public class Calculator {

    public static double getNumber(Scanner scanner) {
        double k;
        while (!scanner.hasNextInt() & !scanner.hasNextDouble()) {
            System.out.print("Provided data is invalid, only integer or double accepted! ");
            scanner.next();
        }
        k = scanner.nextDouble();
        return k;
    }

    public static char getOperator(Scanner scanner) {
        System.out.print("To continue, please input +, -, * or /: ");
        return scanner.next().charAt(0);
    }

    public static void calculateResult(char operator, double x, double y) {
        switch (operator) {
            case '+':
                System.out.println("The result of summarizing " + x + " and " + y + " is " + Calculator.toSummarize(x, y));
                break;
            case '*':
                System.out.println("The result of multiplication " + x + " and " + y + " is " + Calculator.toMultiply(x, y));
                break;
            case '-':
                System.out.println("The result of subtraction " + y + " from " + x + " is " + Calculator.toSubtract(x, y));
                break;
            case '/':
                System.out.println("The result of division " + x + " by " + y + " is "+ Calculator.toDivide(x, y));
                break;
            default:
                System.out.println("Data is invalid");
        }
    }

    public static double toSummarize(double x, double y) {
        return x + y;
    }

    public static double toMultiply(double x, double y) {
        return x * y;
    }

    public static double toSubtract(double x, double y) {
        return x - y;
    }

    public static double toDivide(double x, double y) {
        return x / y;
    }
}