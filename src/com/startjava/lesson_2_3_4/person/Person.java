package com.startjava.lesson_2_3_4.person;

public class Person {
    
    char sex = 'M';
    String name = "Alexandr";
    float height = 1.8f;
    float weight = 70.5f;
    int age = 27;

    void walk() {
        System.out.println("Прошел несколько шагов");
    }

    String sit() {
        return "sit";
    }

    void run() {
        System.out.println("Побежал");
    }

    String say() {
        return "say";
    }

    boolean learnJava() {
        return true;
    }
}