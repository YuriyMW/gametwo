package com.ymw;

import com.ymw.heroTypes.Mage;
import com.ymw.heroTypes.Warrior;

public class TrainingGround {

    public static void main(String[] args) {

        Hero boss = new Hero("Vasyl");
        boss.attackEnemy();

        Hero pes = new Warrior("Pes");
        pes.attackEnemy();

        Mage mage = new Mage("Main mage");
        mage.attackEnemy();
    }

}
