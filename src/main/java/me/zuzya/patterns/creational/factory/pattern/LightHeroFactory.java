package me.zuzya.patterns.creational.factory.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;
import me.zuzya.patterns.core.hero.SideType;

public class LightHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        return new AgilityHero(SideType.LIGHT);
    }

    public IntelligenceHero createIntelligenceHero() {

        return new IntelligenceHero(SideType.LIGHT);
    }
}
