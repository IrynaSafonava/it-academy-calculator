package by.itacademy;

import java.util.Scanner;

public class Menu {

    public static int askFurtherAction(Scanner sc) {
        int action;
        do {
            System.out.println("Choose [1] to continue or [0] to exit.");
            while (!sc.hasNextInt()) {
                System.out.println("Input is not correct. Positive integer required. " +
                        "Please choose [1] to continue or [0] to exit");
                sc.next();
            }
            action = sc.nextInt();
        } while (action != 0 & action != 1);
        return action;
    }

    public static int continueProgramme(Scanner scanner){
        System.out.print("Please, enter X: ");
        double x = Calculator.getNumber(scanner);
        System.out.print("Please, enter Y: ");
        double y = Calculator.getNumber(scanner);
        char operator = Calculator.getOperator(scanner);
        Calculator.calculateResult(operator, x, y);
        return Menu.askFurtherAction(scanner);
    }
}
