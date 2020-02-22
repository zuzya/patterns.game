package me.zuzya.structural.adapter;

import me.zuzya.core.accessories.Cataloged;
import me.zuzya.core.accessories.ItemType;

/**
 * Adapter
 */
public class ItemToCatalogedAdapter implements Cataloged {

    private ItemType type;

    public ItemToCatalogedAdapter(ItemType type) {

        this.type = type;
    }

    /**
     * Adapter method
     * 
     * @return
     */
    @Override
    public String getName() {

        return type.name();
    }
}
