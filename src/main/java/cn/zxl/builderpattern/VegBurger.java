package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
