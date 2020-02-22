package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.creational.core.hero.Hero;
import me.zuzya.creational.core.hero.IntelligenceHero;

public class IntelligenceHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new IntelligenceHero();
    }
}
