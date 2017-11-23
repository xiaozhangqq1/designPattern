package cn.zxl.abstractfactorybean;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
