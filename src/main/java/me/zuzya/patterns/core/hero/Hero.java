package me.zuzya.patterns.core.hero;

import java.util.List;

import me.zuzya.patterns.core.accessories.BaseItem;
import me.zuzya.patterns.core.accessories.Item;

public interface Hero {

    int getMoney();

    int getFreeSlots();

    void addItem(BaseItem item);

    List<Item> getItems();

}
