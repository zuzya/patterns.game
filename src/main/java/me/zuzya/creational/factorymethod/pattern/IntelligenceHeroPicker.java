package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.core.hero.Hero;
import me.zuzya.core.hero.IntelligenceHero;

public class IntelligenceHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new IntelligenceHero();
    }
}
