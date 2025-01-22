package ru.otus.l_2;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter the operation number: 1 +, 2 -, 3 *, 4 /");
            int operation = sc.nextInt();

            String result = switch (operation) {
                case 1 -> num1 + " + " + num2 + " = " + (num1 + num2);
                case 2 -> num1 + " - " + num2 + " = " + (num1 - num2);
                case 3 -> num1 + " * " + num2 + " = " + (num1 * num2);
                case 4 -> num1 + " / " + num2 + " = " + (num1 / num2);
                default -> "Such an operation does not exist";
            };

            System.out.println(result);

            System.out.println("Do you want to perform another operation?");
            sc.nextLine(); // сброс сканера

            String answer = sc.nextLine();
            if (!answer.equals("y")) {
                break;
            }
        }

        System.out.println("Calculator finished work");
    }
}
