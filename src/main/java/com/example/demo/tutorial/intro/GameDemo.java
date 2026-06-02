package com.example.demo.tutorial.intro;

public class GameDemo {
    public static void main(String[] args) {
        Weapon fireFlower = new FireFlower(3);
        Character sarah = new Sarah(fireFlower);
        Character steve = new Steve(fireFlower);

        System.out.println(sarah.getName() + " has " + sarah.getHealth() + " health.");
        System.out.println(steve.getName() + " has " + steve.getHealth() + " health.");

        try {
            sarah.attack();
            steve.attack();
            sarah.attack();

            steve.attack(); // This will throw an exception since the weapon is out of charges
        } catch (Exception e) {
            System.out.println("Game over: " + e.getMessage());
        }
    }
}
