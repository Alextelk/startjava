package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    Scanner scanner = new Scanner(System.in);

    public void enterNumPlayer(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число");
        number = scanner.nextInt();
        player.setNumbers(number);
    }

    public boolean numberCheck(Player player) {
        if (number > randomNumber) {
            System.out.println("Ваше число больше загаданного");
            return false;
        } else if (number < randomNumber) {
            System.out.println("Ваше число меньше загаданного");
            return false;
        } else {
            System.out.println("Ура, игрок " + player.getName() + " победил!");
            return true;
        }
    }

    public boolean countCheck(Player player) {
        if(player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    public void showArrayNumbers(Player player) {
        System.out.println("Числа игрока " + player.getName());
        for (int array : player.getNumbers()) {
            System.out.print(array + " ");
        }
    }

    int number;
    int randomNumber;
    public void start() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        System.out.println("\n" + "Я загадал число от 0 до 100, попробуй угадать. У каждого игрока по 10 попыток");
        firstPlayer.setCount(0);
        firstPlayer.arraysFill();
        secondPlayer.setCount(0);
        secondPlayer.arraysFill();
        do {
            enterNumPlayer(firstPlayer);
            if(numberCheck(firstPlayer)) {
                break;
            }
            enterNumPlayer(secondPlayer);
            if(numberCheck(secondPlayer)) {
                break;
            }
        } while (!countCheck(firstPlayer) || !countCheck(secondPlayer));

        showArrayNumbers(firstPlayer);
        System.out.println("\n");
        showArrayNumbers(secondPlayer);
    }
}