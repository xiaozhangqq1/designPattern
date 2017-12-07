package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
