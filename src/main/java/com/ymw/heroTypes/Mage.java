package com.ymw.heroTypes;

import com.ymw.Enemy;
import com.ymw.Hero;

public class Mage extends Hero {

    private final int power = 9;

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //super.attackEnemy();
        System.out.println("Mage "+getName()+" attack enemy");
        enemy.takeDamage(power);

    }
}
