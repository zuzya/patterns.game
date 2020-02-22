package me.zuzya.creational.factorymethod.pattern;

import me.zuzya.creational.core.hero.Hero;

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
