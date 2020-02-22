package me.zuzya.patterns.creational.factorymethod.pattern;

import me.zuzya.patterns.core.hero.Hero;
import me.zuzya.patterns.core.hero.IntelligenceHero;

public class IntelligenceHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new IntelligenceHero();
    }
}
