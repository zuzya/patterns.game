package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.creational.core.AgilityHero;
import me.zuzya.creational.core.Hero;

public class AgilityHeroPicker implements HeroPicker {

    public Hero pickHero() {

        return new AgilityHero();
    }
}
