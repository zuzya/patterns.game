package me.zuzya.patterns.structural.decorator;

import me.zuzya.patterns.core.mobs.Enemy;

public class FlyingEnemyDecorator extends EnemyDecorator {

    public FlyingEnemyDecorator(Enemy enemy) {

        super(enemy);
    }

    @Override
    public int getDamage() {

        return 2 * super.getDamage();
    }

    @Override
    public int getHealth() {

        return super.getHealth() / 2;
    }
}
