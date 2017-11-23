package cn.zxl.abstractfactorybean;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
