package me.zuzya.patterns.structural.decorator;

import java.util.ArrayList;

import me.zuzya.patterns.core.mobs.Enemy;
import me.zuzya.patterns.core.mobs.Mob;
import me.zuzya.patterns.structural.composite.Pack;

public class Runner {

    public void run() {

        Enemy enemy = new Mob(10, 10);
        PollutedEnemyDecorator pollutedEnemy = new PollutedEnemyDecorator(enemy);
        FlyingEnemyDecorator flyingEnemy = new FlyingEnemyDecorator(enemy);

        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(pollutedEnemy);
        enemies.add(flyingEnemy);

        Pack pack = new Pack(enemies);

    }
}
