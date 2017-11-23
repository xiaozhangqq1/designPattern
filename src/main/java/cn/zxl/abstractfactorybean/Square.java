package cn.zxl.abstractfactorybean;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
