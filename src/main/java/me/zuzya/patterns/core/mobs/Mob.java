package me.zuzya.patterns.core.mobs;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mob implements Enemy {

    private int damage;

    private int health;

    public Mob(int damage, int health) {

        this.damage = damage;
        this.health = health;
    }
}
