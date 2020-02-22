package me.zuzya.patterns.creational.factorymethod.pattern;

import me.zuzya.patterns.core.hero.Hero;

/**
 * Learn Factory Method
 */
public interface HeroPicker {

    /**
     * Factory method
     * 
     * @return
     */
    Hero pickHero();
}
