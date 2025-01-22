package ru.otus.l_1.pdf;

import java.util.stream.IntStream;

public class Pdf {
    public static void main(String[] args) {
//        helloWorld();
//        variablesExample();
//        mathOps();
//        printHelloThreeTimes();
//        sumAndPrint();
        ifExample();
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void variablesExample() {
        int temperature = 10;
        int bobAge = 24;

        float x;
        x = 21.12F;
    }

    public static void mathOps() {
        int val = 10;
        System.out.println(val); // 10

        val++; // = val += 1
        System.out.println(val); // 11

        val--;
        System.out.println(val); // 10

        val += 10;
        System.out.println(val); // 20

        val -= 10;
        System.out.println(val); // 10

        val *= 10;
        System.out.println(val); // 100

        val /= 10;
        System.out.println(val); // 10
    }

    public static void printHelloThreeTimes() {
        IntStream.rangeClosed(1, 3).forEach(it -> System.out.println("Hello"));
    }

    public static void sumAndPrint() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    public static void ifExample() {
        int a = 10;
        int b = 20;
        int sum = a + b;

        if (a > 10) {
            System.out.println("The value of the variable a is strictly greater than 10");
        }

        if (a != 10) {
            System.out.println("The value of variable a is not equal to 10");
        }

        if (sum >= 0) {
            System.out.println("The sum of a and b is greater than or equal to 0");
        }

        if (a == b) {
            System.out.println("The value of variable a is equal to the value of variable b");
        }
    }
}
