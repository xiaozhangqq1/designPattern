package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.9f;
    }
}
