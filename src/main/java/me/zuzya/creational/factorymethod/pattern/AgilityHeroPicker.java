package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.creational.core.hero.AgilityHero;
import me.zuzya.creational.core.hero.Hero;

public class AgilityHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new AgilityHero();
    }
}
