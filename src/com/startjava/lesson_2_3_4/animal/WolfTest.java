package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf greyWolf = new Wolf();
        greyWolf.setSex('M');
        greyWolf.setName("Серый");
        greyWolf.setWeight(30);
        greyWolf.setAge(3);
        greyWolf.setColor("Серый");
        System.out.println(greyWolf.getSex());
        System.out.println(greyWolf.getName());
        System.out.println(greyWolf.getWeight());
        System.out.println(greyWolf.getAge());
        System.out.println(greyWolf.getColor());

        greyWolf.walk();
        greyWolf.sit();
        greyWolf.run();
        greyWolf.howl();
        greyWolf.hunt();
    }
}