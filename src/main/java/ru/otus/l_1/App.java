package ru.otus.l_1;

import java.util.Scanner;

public class App {
    // main - точка входа в приложение
    public static void main(String[] args) {
//        printHello();
//        drawBox();
//        variableExample();
        userInputExample();
//        typesExample();
//        mathOps();
//        concatenation();
//        ifExample();
    }

    public static void printHello() {
        System.out.println("Hello World!!!");
        System.out.println(1_000_000);
    }

    public static void drawBox() {
        System.out.println("-----");
        System.out.println("-   -");
        System.out.println("-   -");
        System.out.println("-   -");
        System.out.println("-----");
    }

    public static void variableExample() {
        int a = 500;
        System.out.println(a);
        a = 0;
        System.out.println(a);

        int b;
        // compile err: Variable 'b' might not have been initialized - нельзя использовать неинициализированные локальные переменные
//        System.out.println(b);

        // compile err: Variable 'a' is already defined in the scope
//        int a;

        // compile err: Cannot resolve symbol 'c'
//        System.out.println(c);

        // нельзя называть переменные зарезервированными словами
//        int void = 10;

        // lower camel case
        int intVariable = 5; // ok
        int IntVariable = 5; // wrong
    }

    public static void userInputExample() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
//        System.out.println("You entered: " + num1);

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
//        System.out.println("You entered: " + num2);

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
    }

    public static void typesExample() {
        int a;
        a = 10;
//        a = 10.4; // compile err: incompatible types: possible lossy conversion from double to int
//        a = false; // compile err: incompatible types: boolean cannot be converted to int
//        a = "text"; // compile err: incompatible types: java.lang.String cannot be converted to int
        System.out.println(a);
    }

    public static void mathOps() {
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);
        a += 100;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
    }

    public static void concatenation() {
        int a = 4;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void ifExample() {
        int temperature = 25;
        if (temperature >= 24) {
            System.out.println("Need to put on a t-shirt");
        } else {
            System.out.println("Need to put on a jacket");
        }

        int a = 1;
        if (a == 1) {
            System.out.println("RED");
        } else if (a == 2) {
            System.out.println("GREEN");
        } else if (a == 3) {
            System.out.println("BLUE");
        }
    }
}
