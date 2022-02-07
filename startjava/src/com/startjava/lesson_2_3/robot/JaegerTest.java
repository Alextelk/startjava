package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger typhoon = new Jaeger("Crimson Typhoon", "Mark-4", 8, 6);
        System.out.println(typhoon.getModelName());
        System.out.println(typhoon.getMark());
        System.out.println(typhoon.getStrength());
        System.out.println(typhoon.getArmor());

        typhoon.fight();
        typhoon.useWeapon();
        System.out.println(typhoon.scanKaiju() + "\n");

        Jaeger danger = new Jaeger("Gipsy Danger", "Mark-3", 8, 6);
        System.out.println(danger.getModelName());
        System.out.println(danger.getMark());
        System.out.println(danger.getStrength());
        System.out.println(danger.getArmor());

        danger.fight();
        danger.useWeapon();
        System.out.println(danger.scanKaiju());
    }
}