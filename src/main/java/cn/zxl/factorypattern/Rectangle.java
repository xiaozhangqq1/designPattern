package cn.zxl.factorypattern;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
