package com.ymw;

public abstract class Hero {

    private final String name;
    private final int power = 13;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
    /*public void attackEnemy(Enemy enemy) {

        System.out.println("Hero "+getName()+" attack enemy!");
        enemy.takeDamage(power);

    }*/

}
