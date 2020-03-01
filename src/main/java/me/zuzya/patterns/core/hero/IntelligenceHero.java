package me.zuzya.patterns.core.hero;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IntelligenceHero extends Hero {

    public IntelligenceHero(SideType side) {

        super(side);
    }

    @Override
    public HeroType getHeroType() {

        return HeroType.INTELLIGENCE;
    }
}
