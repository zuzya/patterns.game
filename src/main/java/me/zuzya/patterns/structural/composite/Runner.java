package me.zuzya.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import me.zuzya.patterns.core.mobs.Enemy;
import me.zuzya.patterns.core.mobs.Mob;

public class Runner {

    public void run() {

        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Pack(new Mob()));
        enemies.add(new Mob());

        Pack pack = new Pack(enemies);

        // getting damage value independently of inner pack's structure
        int damage = pack.getDamage();
    }
}
