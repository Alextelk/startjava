public class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void calculation () {
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
                int result = 1;
                for(int i = 1; i <= secondNumber; i++) {
                    result *= firstNumber;
                }
                System.out.println(result);
                break;
            default:
                System.out.println("Такой операции нет");
                break;
        }
    }
}

