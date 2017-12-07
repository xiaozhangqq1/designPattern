package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
