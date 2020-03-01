package me.zuzya.patterns.behavioral.chain;

import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.accessories.ItemType;
import me.zuzya.patterns.core.hero.Hero;

public class HighLvlItemChecker extends BaseChecker {

    @Override
    public boolean ownCheck(Hero hero, Item item) {

        if (ItemType.CHEST == item.getItemType()) {
            return 16 > hero.getLevel();
        }
        return super.ownCheck(hero, item);
    }
}
