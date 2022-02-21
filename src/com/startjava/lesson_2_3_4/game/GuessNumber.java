package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int number;
    private int randomNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }
    Scanner scanner = new Scanner(System.in);


    private boolean checkCount(Player player) {
        if(player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число");
        number = scanner.nextInt();
        player.setEnteredNumber(number);
    }

    private boolean compareNumber(Player player) {
        if(number == randomNumber) {
            System.out.println("Ура! Игрок " + player.getName() + " победил!");
            return true;
        }
        if (number > randomNumber) {
            System.out.println("Ваше число больше загаданного");
        } else if (number < randomNumber) {
            System.out.println("Ваше число меньше загаданного");
        }
        return false;
    }

    private void showArrayNumbers(Player player) {
        System.out.println("Числа игрока " + player.getName());
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
    }
    public void start() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        System.out.println("\n" + "Я загадал число от 0 до 100, попробуй угадать. У каждого игрока по 10 попыток");
        firstPlayer.setCount(0);
        firstPlayer.arraysFill();
        secondPlayer.setCount(0);
        secondPlayer.arraysFill();
        do {
            inputNumber(firstPlayer);
            if(compareNumber(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if(compareNumber(secondPlayer)) {
                break;
            }
        } while (!checkCount(firstPlayer) || !checkCount(secondPlayer));

        showArrayNumbers(firstPlayer);
        System.out.println("\n");
        showArrayNumbers(secondPlayer);
    }
}