package me.zuzya.patterns.structural.decorator;

import me.zuzya.patterns.core.mobs.Enemy;

public class EnemyDecorator implements Enemy {

    private Enemy enemy;

    public EnemyDecorator(Enemy enemy) {

        this.enemy = enemy;
    }

    @Override
    public int getDamage() {

        return enemy.getDamage();
    }

    @Override
    public int getHealth() {

        return enemy.getHealth();
    }
}
