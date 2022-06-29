package com.ymw.heroTypes;

import com.ymw.Enemy;
import com.ymw.Hero;

public class Archer extends Hero {

    private final int power = 7;

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        //super.attackEnemy();
        System.out.println("Archer "+getName()+" attack enemy");
        enemy.takeDamage(power);

    }
}
