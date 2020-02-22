package me.zuzya.patterns.core.engine;

import lombok.extern.slf4j.Slf4j;
import me.zuzya.patterns.core.exception.BuingException;
import me.zuzya.patterns.core.hero.Hero;
import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.accessories.ItemType;
import me.zuzya.patterns.core.map.GameMap;
import me.zuzya.patterns.core.map.ItemShop;
import me.zuzya.patterns.creational.factory.Team;
import me.zuzya.patterns.structural.adapter.ItemToCatalogedAdapter;

@Slf4j
public class GameEngine {

    private Team teamA;

    private Team teamB;

    private GameMap gameMap;

    public void giveItemToHero(ItemType itemType, Hero hero) {

        ItemShop shop = gameMap.getItemShop();
        try {
            ItemToCatalogedAdapter adapter = new ItemToCatalogedAdapter(itemType);
            // adopted
            Item item = shop.buy(adapter, hero.getMoney());
            if (hero.getFreeSlots() > 0) {
                hero.addItem(item);
            }
        } catch (BuingException e) {
            log.warn("Hero can't buy this item!", e);
        }
    }
}
