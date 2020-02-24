package me.zuzya.patterns.structural.decorator;

import me.zuzya.patterns.core.mobs.Enemy;

public class PollutedEnemyDecorator extends EnemyDecorator {

    public PollutedEnemyDecorator(Enemy enemy) {

        super(enemy);
    }

    @Override
    public int getDamage() {

        return 3 * super.getDamage();
    }

    @Override
    public int getHealth() {

        return 2 * super.getHealth();
    }
}
