package me.zuzya.patterns.creational.factory.pattern;

import me.zuzya.patterns.core.hero.AgilityHero;
import me.zuzya.patterns.core.hero.IntelligenceHero;
import me.zuzya.patterns.core.hero.SideType;

public class DarkHeroFactory implements AbstractHeroFactory {

    public AgilityHero createAgilityHero() {

        /*
         * Bridge: instead of creating DarkAgilityHero we used composition with SideType
         */
        return new AgilityHero(SideType.DARK);
    }

    public IntelligenceHero createIntelligenceHero() {

        return new IntelligenceHero(SideType.DARK);
    }
}
