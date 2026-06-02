package com.example.demo.tutorial.intro;

public class Sarah implements Character {
    private String name;
    private int health;
    private Weapon weapon;

    public Sarah(Weapon weapon) {
        this.name = "Sarah";
        this.health = 120;
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
