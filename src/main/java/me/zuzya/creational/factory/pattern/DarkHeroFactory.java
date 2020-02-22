package me.zuzya.creational.factory.pattern;

import me.zuzya.creational.core.AgilityHero;
import me.zuzya.creational.core.DarkAgilityHero;
import me.zuzya.creational.core.DarkIntelligenceHero;
import me.zuzya.creational.core.IntelligenceHero;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new DarkAgilityHero();
    }

    public IntelligenceHero createIntelligenceHero() {

        return new DarkIntelligenceHero();
    }
}
