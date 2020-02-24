package me.zuzya.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

import me.zuzya.patterns.core.mobs.Enemy;
import me.zuzya.patterns.core.mobs.Mob;

/**
 * Composite: contains list of packs or mobs, which implement shared Enemy interface
 */
public class Pack implements Enemy {

    private List<Enemy> children;

    public Pack() {

        children = new ArrayList<>();
    }

    public Pack(List<Enemy> children) {

        this.children = children;
    }

    public Pack(Mob mob) {

        children = new ArrayList<>();
        children.add(mob);
    }

    @Override
    public int getDamage() {

        return children.stream().map(Enemy::getDamage).reduce(Integer::sum).orElse(0);
    }

    @Override
    public int getHealth() {

        return children.stream().map(Enemy::getHealth).reduce(Integer::sum).orElse(0);
    }
}
