package me.zuzya.patterns.core.hero;

import me.zuzya.patterns.core.accessories.Item;

public interface Hero {

    int getMoney();

    int getFreeSlots();

    void addItem(Item item);
}
