package com.ymw.heroTypes;

import com.ymw.Hero;

public class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println("Mage "+getName()+" attack enemy");
    }
}
