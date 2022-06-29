package com.ymw;

import com.ymw.heroTypes.Archer;
import com.ymw.heroTypes.Mage;
import com.ymw.heroTypes.Warrior;

public class TrainingGround {

    public static void main(String[] args) {

        Hero arch = new Archer("Vasyl");
        Hero pes = new Warrior("Pes");
        Mage mage = new Mage("Main mage");

        Enemy dragon = new Enemy(25);

        arch.attackEnemy(dragon);
        pes.attackEnemy(dragon);
        mage.attackEnemy(dragon);
    }

}
