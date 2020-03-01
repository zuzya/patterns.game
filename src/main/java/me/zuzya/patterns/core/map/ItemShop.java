package me.zuzya.patterns.core.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.zuzya.patterns.behavioral.chain.Checker;
import me.zuzya.patterns.behavioral.chain.CompatibleChecker;
import me.zuzya.patterns.behavioral.chain.EnoughMoneyChecker;
import me.zuzya.patterns.behavioral.chain.HighLvlItemChecker;
import me.zuzya.patterns.core.accessories.Cataloged;
import me.zuzya.patterns.core.accessories.Item;
import me.zuzya.patterns.core.exception.BuingException;
import me.zuzya.patterns.core.hero.Hero;

public class ItemShop {

    private Map<Cataloged, Integer> catalog;

    private Map<Cataloged, Integer> itemsBalance;

    public ItemShop() {

        this.catalog = new HashMap<>();
        this.itemsBalance = new HashMap<>();
    }

    public Item buy(Cataloged cataloged, Hero hero) throws BuingException {

        // todo: simplify catalog checking with chain of responsibility for example
        if (catalog.containsKey(cataloged)) {
            if (catalog.get(cataloged) <= hero.getMoney()) {
                if (itemsBalance.get(cataloged) > 0) {

                    Item item = new Item(cataloged.getName());

                    // chain of responsibility
                    if (getCheckersChain().stream()
                            .allMatch(checker -> checker.check(hero, item))) {
                        return item;
                    } else {
                        throw new BuingException(
                                "sorry, this kind of item is not compatible to this hero");
                    }

                } else {
                    throw new BuingException("sorry, this kind of item is ended");
                }
            } else {
                throw new BuingException("not enough money!");
            }
        } else {
            throw new BuingException("not found this item!");
        }
    }

    private List<Checker> getCheckersChain() {

        // todo: move to Shop configuration
        List<Checker> checkers = new ArrayList<>();
        checkers.add(new CompatibleChecker());
        checkers.add(new EnoughMoneyChecker());
        checkers.add(new HighLvlItemChecker());

        return checkers;
    }
}
