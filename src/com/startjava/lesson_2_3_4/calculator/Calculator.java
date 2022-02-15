package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;
    private String expression;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public void calculate() {
        String[] example = expression.split(" ");
        firstNumber = Integer.parseInt(example[0]);
        mathOperation = example[1].charAt(0);
        secondNumber = Integer.parseInt(example[2]);
        switch(mathOperation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Такой операции нет");
                break;
        }
    }
}

