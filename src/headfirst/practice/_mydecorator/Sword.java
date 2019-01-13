package headfirst.practice._mydecorator;

/**
 * @author jerry
 * @create 17/9/28 13:03
 */
public class Sword extends WeaponDecorator {

    public Sword(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + ",剑";
    }

    @Override
    public int attack() {
        return hero.attack() + 10;
    }
}
