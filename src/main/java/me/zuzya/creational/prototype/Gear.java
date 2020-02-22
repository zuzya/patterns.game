package me.zuzya.creational.prototype;

import me.zuzya.core.accessories.Power;

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
