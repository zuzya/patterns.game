package me.zuzya.patterns.core.hero;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.zuzya.patterns.core.accessories.*;

@NoArgsConstructor
@Getter
@Setter
public class AbstractHero implements Hero {

    private SideType side;

    private String name;

    private int speed;

    private int haste;

    private int stamina;

    private int life = stamina;

    private int manaReserv;

    private int mana = manaReserv;

    private Power power;

    private List<Item> items;

    private List<Buf> buffs;

    private List<Curse> curses;

    private int money;

    private int freeSlots;

    public AbstractHero(SideType side) {

        this.side = side;
    }

    @Override
    public int getMoney() {

        return money;
    }

    @Override
    public int getFreeSlots() {

        return freeSlots;
    }

    @Override
    public void addItem(BaseItem item) {

        this.items.add(item);
    }

    public List<Item> getItems() {

        return items;
    }

    /**
     * Builder
     */
    public static Builder builder = new Builder();

    public static class Builder {

        private AbstractHero hero;

        public Builder() {

            hero = new AbstractHero();
            hero.items = new ArrayList<Item>();
            hero.buffs = new ArrayList<Buf>();
            hero.curses = new ArrayList<Curse>();
        }

        public AbstractHero build() {

            return hero;
        }

        public Builder setName(String name) {

            hero.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {

            hero.speed = speed;
            return this;
        }

        public Builder setHaste(int haste) {

            hero.haste = haste;
            return this;
        }

        public Builder setStamina(int stamina) {

            hero.stamina = stamina;
            return this;
        }

        public Builder setManaReserv(int manaReserv) {

            hero.manaReserv = manaReserv;
            return this;
        }

        public Builder setPower(Power power) {

            hero.power = power;
            return this;
        }

        public Builder addBuf(Buf buf) {

            hero.buffs.add(buf);
            return this;
        }

        public Builder addCurse(Curse curse) {

            hero.curses.add(curse);
            return this;
        }

    }

}
