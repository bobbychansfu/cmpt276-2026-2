package com.example.demo.tutorial.intro;

public class Steve implements Character {
    private String name;
    private int health;
    private Weapon weapon;

    // Constructor injection - the weapon is passed in
    public Steve(Weapon weapon) {
        this.name = "Steve";
        this.health = 100;
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        try {
            weapon.use();
        } catch (GameException e) {
            System.out.println(getName() + " failed to attack: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }
}
