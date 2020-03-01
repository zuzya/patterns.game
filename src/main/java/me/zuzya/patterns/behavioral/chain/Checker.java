package me.zuzya.patterns.behavioral.chain;

import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.hero.Hero;

public interface Checker {

    boolean check(Hero hero, Item item);

}
