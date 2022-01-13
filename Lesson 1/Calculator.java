public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
        char command = '+';
        int result = 0;
        if (command == '+') {
            result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (command == '-') {
            result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (command == '*') {
            result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (command == '/') {
            result = firstNumber / secondNumber;
            System.out.println(result);
        } else if (command == '^') {
            result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        } else if (command == '%') {
            result = firstNumber % secondNumber;
            System.out.println(result);
        } else {
            System.out.println("Такой команды нет");
        }
    }
}