package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void fight() {
        System.out.println("Готов к бою");
    }

    public String scanKaiju() {
        return "Поиск Кайдзю";
    }

    public void useWeapon() {
        System.out.println("Достал оружие");
    }
}