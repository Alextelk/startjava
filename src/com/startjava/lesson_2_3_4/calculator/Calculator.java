package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int firstNumber = Integer.parseInt(partsExpression[0]);
        char mathOperation = partsExpression[1].charAt(0);
        int secondNumber = Integer.parseInt(partsExpression[2]);
        switch(mathOperation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return (int) Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("Такой операции нет");
                return 0;
        }
    }
}