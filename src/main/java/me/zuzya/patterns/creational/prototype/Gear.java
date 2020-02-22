package me.zuzya.patterns.creational.prototype;

import me.zuzya.patterns.core.accessories.Power;

public class Gear implements Cloneable {

    private Power power;

    public Gear(Gear gear) {

        this.power = gear.power;
    }

    /**
     * Prototype method
     * 
     * @param gear
     * @return
     */
    public Gear clone(Gear gear) {

        return new Gear(gear);
    }
}
