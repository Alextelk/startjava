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
            calculator.setExpression(scanner.nextLine());

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
