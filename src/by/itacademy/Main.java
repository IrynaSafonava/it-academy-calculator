package by.itacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter X: ");
        double x = Calculator.getNumber(scanner);
        System.out.print("Please, enter Y: ");
        double y = Calculator.getNumber(scanner);
        char operator = Calculator.getOperator(scanner);
        Calculator.calculateResult(operator, x, y);

        int action = Menu.askFurtherAction(scanner);

        while (action >= 0) {
            switch (action) {
                case 0:
                    System.out.println("Closing the programme. Bye-Bye!");
                    action = -1;
                    break;
                case 1:
                    action = Menu.continueProgramme(scanner);
                    break;
            }
        }
    }
}
