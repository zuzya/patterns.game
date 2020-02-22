package me.zuzya.creational.factorymethod;

import me.zuzya.creational.factorymethod.pattern.AgilityHeroPicker;
import me.zuzya.creational.factorymethod.pattern.HeroPicker;
import me.zuzya.creational.factorymethod.pattern.IntelligenceHeroPicker;

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
