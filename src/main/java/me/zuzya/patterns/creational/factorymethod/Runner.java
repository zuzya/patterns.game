package me.zuzya.patterns.creational.factorymethod;

import me.zuzya.patterns.creational.factorymethod.pattern.AgilityHeroPicker;
import me.zuzya.patterns.creational.factorymethod.pattern.HeroPicker;
import me.zuzya.patterns.creational.factorymethod.pattern.IntelligenceHeroPicker;

public class Runner {

    public void pick(String heroType) {

        HeroPicker picker;

        if ("agility".equals(heroType)) {
            picker = new AgilityHeroPicker();
        } else {
            picker = new IntelligenceHeroPicker();
        }

        picker.pickHero();
    }
}
