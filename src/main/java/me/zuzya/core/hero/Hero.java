package me.zuzya.core.hero;

import me.zuzya.core.accessories.Item;

public interface Hero {

    int getMoney();

    int getFreeSlots();

    void addItem(Item item);
}
