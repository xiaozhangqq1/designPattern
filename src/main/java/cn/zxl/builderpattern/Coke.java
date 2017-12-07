package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
