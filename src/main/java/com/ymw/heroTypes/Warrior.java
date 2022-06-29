package com.ymw.heroTypes;

import com.ymw.Enemy;
import com.ymw.Hero;

public class Warrior extends Hero {

    //private int health;
    private final int power = 11;

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //super.attackEnemy();
        System.out.println("Warrior " + getName() + " attack enemy");
        enemy.takeDamage(power);

    }
}