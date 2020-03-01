package me.zuzya.patterns.core.accessories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.zuzya.patterns.core.hero.Hero;
import me.zuzya.patterns.core.hero.HeroType;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {

    @Getter
    private String name;

    private HeroType heroType;

    private ItemType itemType;

    public Item(String name) {
        this.name = name;
    }

    public void applyEffect(Hero hero) {

    }
}
