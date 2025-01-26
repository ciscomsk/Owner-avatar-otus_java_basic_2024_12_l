package ru.otus.l_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            System.out.println("Enter the operation number: 1 +, 2 -, 3 *");
            int operation = sc.nextInt();

            String result = switch (operation) {
                case 1 -> num1 + " + " + num2 + " = " + (num1 + num2);
                case 2 -> num1 + " - " + num2 + " = " + (num1 - num2);
                case 3 -> num1 + " * " + num2 + " = " + (num1 * num2);
                default -> "Such an operation does not exist";
            };

            System.out.println(result);

            System.out.println("Do you want to perform another operation?");
            sc.nextLine(); // сброс сканера

            String answer = sc.nextLine();
            Set<String> positiveAnswers = new HashSet<>(Arrays.asList("y", "Y"));
            if (!positiveAnswers.contains(answer)) {
                break;
            }
        }

        System.out.println("Calculator finished work");
    }
}
