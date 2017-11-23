package cn.zxl.abstractfactorybean;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
