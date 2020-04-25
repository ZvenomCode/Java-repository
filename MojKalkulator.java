package com.example.helloworld;

import java.util.Scanner;

public class MojKalkulator {

    public static Scanner keyInput = new Scanner(System.in);
    public static int firstNum;
    public static int secondNum;
    public static int answer;
    public static int operator;

    public static void addition() {
        answer = firstNum + secondNum;
    }

    public static void subtraction() {
        answer = firstNum - secondNum;
    }

    public static void multiplication() {
        answer = firstNum * secondNum;
    }

    public static void division() {
        answer = firstNum / secondNum;

    }


    public static void main (String[] args) {
        System.out.println("Enter first number: ");
        firstNum = keyInput.nextInt();

        System.out.println("Enter an operator: ");
        operator = keyInput.next().charAt(0);

        System.out.println("Enter second number:");
        secondNum = keyInput.nextInt();

        if (operator == '+' ) {
            addition();
        } else if (operator == '-') {
            subtraction();
        } else if (operator == '*') {
            multiplication();
        } else if (operator == '/') {
            division();
        }

        else {
            System.out.println("Konju invalid operator");
        }

        System.out.println("Your answer is:");
        System.out.println(answer);

        keyInput.close();
    }
}
