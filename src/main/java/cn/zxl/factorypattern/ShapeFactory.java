package cn.zxl.factorypattern;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (!shapeType.equalsIgnoreCase("CIRCLE")) {
            if (shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }else if (shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }
        } else {
            return new Circle();
        }
        return null;
    }
}
