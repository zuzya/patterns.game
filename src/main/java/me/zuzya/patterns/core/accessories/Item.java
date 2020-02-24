package me.zuzya.patterns.core.accessories;

import me.zuzya.patterns.core.hero.Hero;

public interface Item {

    String getName();

    void applyEffect(Hero hero);
}
