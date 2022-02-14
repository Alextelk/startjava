package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setMathOperation(char mathOperation) {

        this.mathOperation = mathOperation;
    }

    public void setSecondNumber(int secondNumber) {

        this.secondNumber = secondNumber;
    }

    public void calculate() {
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

