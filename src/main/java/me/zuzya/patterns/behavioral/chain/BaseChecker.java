package me.zuzya.patterns.behavioral.chain;

import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.hero.Hero;

public class BaseChecker implements Checker {

    private Checker checker;

    public boolean check(Hero hero, Item item) {

        if (checker != null) {
            return checker.check(hero, item);
        }
        return ownCheck(hero, item);
    }

    protected boolean ownCheck(Hero hero, Item item) {

        return true;
    }
}
