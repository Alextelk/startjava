package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String expression;
        String option;
        do {
            System.out.println("Введите математическое выражение");
            expression = scanner.nextLine();
            String[] value = expression.split(" ");
            calculator.setFirstNumber(Integer.parseInt(value[0]));
            calculator.setMathOperation(value[1].charAt(0));
            calculator.setSecondNumber(Integer.parseInt(value[2]));


            calculator.calculate();

            System.out.println("Хотите продолжить вычисления yes/no?");
            scanner.nextLine();
            option = scanner.nextLine();
            while(!option.equals("yes") && !option.equals("no")) {
                System.out.println("Введите yes/no");
                option = scanner.nextLine();
            }
        } while(!option.equals("no"));
    }
} 
