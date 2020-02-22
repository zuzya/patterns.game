package me.zuzya.patterns.creational.factorymethod.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.Hero;

public class AgilityHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new AgilityHero();
    }
}
