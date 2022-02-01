import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String option;
        do {
            System.out.println("Введите первое число");
            calculator.setFirstNumber(scanner.nextInt());

            System.out.println("Введите знак математической операции");
            String operation = scanner.next();
            calculator.setMathOperation(operation.charAt(0));

            System.out.println("Введите второе число");
            calculator.setSecondNumber(scanner.nextInt());

            calculator.calculate();

            System.out.println("Хотите продолжить вычисления yes/no?");
            scanner.nextLine();
            option = scanner.nextLine();
            while(!option.equals("no") && !option.equals("yes")) {
                System.out.println("Введите yes/no");
                option = scanner.nextLine();
            }
        } while(!option.equals("no"));
    }
} 
