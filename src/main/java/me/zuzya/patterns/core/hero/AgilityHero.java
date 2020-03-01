package me.zuzya.patterns.core.hero;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AgilityHero extends Hero {

    public AgilityHero(SideType side) {

        super(side);
    }

    @Override
    public HeroType getHeroType() {
        return HeroType.AGILITY;
    }
}
