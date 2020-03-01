package me.zuzya.patterns.behavioral.chain;

import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.hero.Hero;

public class CompatibleChecker extends BaseChecker {

    @Override
    public boolean ownCheck(Hero hero, Item item) {

        return item.getHeroType() == hero.getHeroType();
    }
}
