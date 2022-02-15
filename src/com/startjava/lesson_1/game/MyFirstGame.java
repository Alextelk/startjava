package com.startjava.lesson_1.game;

public class MyFirstGame {
    
    public static void main(String[] args) {
        int randomNumber = 50;
        int userNumber = 100;
        while (userNumber != randomNumber) {
            if (userNumber > randomNumber) {
                System.out.println("Данное число " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            } else if (userNumber < randomNumber) {
                System.out.println("Данное число " + userNumber + " меньше того, что загадал компьютер");
                userNumber++;
            }
        }
        System.out.println("Поздравляю, число " + randomNumber + " угадано!");
    }
}