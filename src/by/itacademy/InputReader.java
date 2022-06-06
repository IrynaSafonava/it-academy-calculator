package by.itacademy;

import java.util.Scanner;
public class InputReader {
    public static double getNumber(Scanner scanner) {
        double number;
        while (!scanner.hasNextInt() & !scanner.hasNextDouble()) {
            System.out.print("Provided data is invalid, only integer or double with dot accepted! ");
            scanner.next();
        }
        number = scanner.nextDouble();
        return number;
    }

    public static char getOperator(Scanner scanner) {
        System.out.print("To continue, please input +, -, * or /: ");
        return scanner.next().charAt(0);
    }
}
