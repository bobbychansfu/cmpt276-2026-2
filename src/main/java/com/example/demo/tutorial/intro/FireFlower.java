package com.example.demo.tutorial.intro;

public class FireFlower implements Weapon {
    private int charges;

    public FireFlower(int initialCharges) {
        this.charges = initialCharges;
    }

    @Override
    public void use() throws GameException {
        if (charges <= 0) {
            throw new GameException("No charges left!");
        }
        charges--;
        System.out.println("Threw a fireball!");
    }

    @Override
    public int getCharges() {
        return charges;
    }
}
