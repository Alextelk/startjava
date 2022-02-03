import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(100);
        System.out.println("\n" + "Я загадал число от 0 до 100, попробуй угадать");
        do {
            System.out.println("\n" + firstPlayer.getName() + ", введите число");
            firstPlayer.setNumber(scanner.nextInt());
            if (firstPlayer.getNumber() > randomNumber) {
                System.out.println("Ваше число больше того, что загадал компьютер");
            } else if(firstPlayer.getNumber() < randomNumber) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
            } else if(firstPlayer.getNumber() == randomNumber) {
                System.out.println(firstPlayer.getName());
                break;
            }
            System.out.println("\n" + secondPlayer.getName() + ", введите число");
            secondPlayer.setNumber(scanner.nextInt());
            if (secondPlayer.getNumber() > randomNumber) {
                System.out.println("Ваше число больше того, что загадал компьютер");
            } else if(secondPlayer.getNumber() < randomNumber) {
                System.out.println("Ваше число меньше того, что загадал компьютер");
            } else if(secondPlayer.getNumber() == randomNumber) {
                System.out.println(secondPlayer.getName());
                break;
            }
        } while(true);
        System.out.println("\n" + "Поздравляю, вы угадали. Это было число: " + randomNumber);
    }
}