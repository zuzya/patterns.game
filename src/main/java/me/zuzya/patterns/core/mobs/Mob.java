package me.zuzya.patterns.core.mobs;

import lombok.Data;

@Data
public class Mob implements Enemy{

    private int damage;

    private int health;
}
