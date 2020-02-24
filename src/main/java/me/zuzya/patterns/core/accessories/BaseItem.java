package me.zuzya.patterns.core.accessories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.zuzya.patterns.core.hero.Hero;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseItem implements Item{

    @Getter
    private String name;

    @Override
    public void applyEffect(Hero hero) {

    }
}
