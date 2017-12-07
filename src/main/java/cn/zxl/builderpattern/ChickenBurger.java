package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
