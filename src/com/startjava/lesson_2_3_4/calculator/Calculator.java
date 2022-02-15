package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;
    private String expression;

    int result;
    public int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        firstNumber = Integer.parseInt(partsExpression[0]);
        mathOperation = partsExpression[1].charAt(0);
        secondNumber = Integer.parseInt(partsExpression[2]);
        switch(mathOperation) {
            case '+':
                result = (firstNumber + secondNumber);
                break;
            case '-':
                result = (firstNumber - secondNumber);
                break;
            case '*':
                result = (firstNumber * secondNumber);
                break;
            case '/':
                result = (firstNumber / secondNumber);
                break;
            case '%':
                result = (firstNumber % secondNumber);
                break;
            case '^':
                result =(int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Такой операции нет");
                break;
        }
        return result;
    }
}

