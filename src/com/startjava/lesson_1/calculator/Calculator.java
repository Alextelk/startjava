package com.startjava.lesson_1.calculator;

public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
        char mathOperation = '^';
        if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '^') {
            int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);
        } else {
            System.out.println("Такой команды нет");
        }
    }
}