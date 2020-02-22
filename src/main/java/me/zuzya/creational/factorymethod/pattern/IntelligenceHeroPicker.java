package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.creational.core.Hero;
import me.zuzya.creational.core.IntelligenceHero;

public class IntelligenceHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new IntelligenceHero();
    }
}
