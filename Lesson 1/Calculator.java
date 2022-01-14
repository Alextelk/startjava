public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
        char mathOperation = '+';
        int result = 1;
        if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '^') {
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