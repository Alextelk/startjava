package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игрок-1 введите имя");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.println("Игрок-2 введите имя");
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        String option = "yes";
        do {
            if(option.equals("yes")) {
                game.start();
            }
                System.out.println("Хотите повторить? yes/no");
                option = scan.nextLine();
        } while(!option.equals("no")); 
    }
}