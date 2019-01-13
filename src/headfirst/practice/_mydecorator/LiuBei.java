package headfirst.practice._mydecorator;

/**
 * @author jerry
 * @create 17/9/28 13:12
 */
public class LiuBei extends Hero {

    public LiuBei(String desc) {
        this.description = desc;
    }

    @Override
    public int attack() {
        return 7;
    }
}
