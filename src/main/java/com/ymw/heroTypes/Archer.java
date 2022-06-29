package com.ymw.heroTypes;

import com.ymw.Hero;

public class Archer extends Hero {


    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        //super.attackEnemy();
        System.out.println("Archer "+getName()+" attack enemy");
    }
}
