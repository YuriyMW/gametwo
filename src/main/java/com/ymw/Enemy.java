package com.ymw;

import com.ymw.Inter.Mortal;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println("  Enemy take damage "+damage);
        System.out.println("  "+ ( isAlive() ? "last health"+this.health : "enemy DIE"));
    }

    @Override
    public boolean isAlive() {
        return (this.health > 0);
    }
}
