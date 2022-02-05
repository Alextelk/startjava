import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "cp866");
        System.out.println("Игрок-1 введите имя");
        String firstPlayerName = scan.nextLine();
        Player firstPlayer = new Player(firstPlayerName);
        System.out.println("Игрок-2 введите имя");
        String secondPlayerName = scan.nextLine();
        Player secondPlayer = new Player(secondPlayerName);
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String option;
        do {
            game.start();
            do {
                System.out.println("Хотите повторить? yes/no");
                option = scan.nextLine();
            } while(!option.equals("no") && !option.equals("yes"));
            if(option.equals("no")) {
                break;
            }
        } while(true); 
    }
}