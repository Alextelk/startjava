import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        do {
            randomNumber = random.nextInt((100) + 1);
        } while(randomNumber == 0);
        int number;
        System.out.println("\n" + "Я загадал число от 0 до 100, попробуй угадать");
        do {
            System.out.println("\n" + firstPlayer.getName() + ", введите число");
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Ваше число больше того, что загадал компьютер");
            } else if(number < randomNumber) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
            } else if(number == randomNumber) {
                System.out.println(firstPlayer.getName());
                break;
            }

            System.out.println("\n" + secondPlayer.getName() + ", введите число");
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Ваше число больше того, что загадал компьютер");
            } else if(number < randomNumber) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
            } else if(number == randomNumber) {
                System.out.println(secondPlayer.getName());
                break;
            }
        } while(true);
        System.out.println("\n" + "Поздравляю, вы угадали. Это было число: " + randomNumber);
    }
}