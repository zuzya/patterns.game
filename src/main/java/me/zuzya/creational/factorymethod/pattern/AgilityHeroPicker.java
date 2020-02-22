package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.core.hero.AgilityHero;
import me.zuzya.core.hero.Hero;

public class AgilityHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new AgilityHero();
    }
}
