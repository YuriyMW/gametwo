package com.ymw.heroTypes;

import com.ymw.Hero;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println("Warrior "+getName()+" attack enemy");
    }
}
