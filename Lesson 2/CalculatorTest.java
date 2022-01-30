import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String repeat;
        do {
            System.out.println("Введите первое число");
            calculator.setFirstNumber(scanner.nextInt());

            System.out.println("Введите знак математической операции");
            String operation = scanner.next();
            calculator.setMathOperation(operation.charAt(0));

            System.out.println("Введите второе число");
            calculator.setSecondNumber(scanner.nextInt());

            calculator.calculation();

            System.out.println("Хотите продолжить вычисления yes/no?");
            scanner.nextLine();
            repeat = scanner.nextLine();
            if(repeat.equals("yes")) {
                System.out.println(" ");
            } else {
                System.out.println("Введите yes/no");
                repeat = scanner.nextLine();
            }
        } while(!(repeat.equals("no")));
    }
}
