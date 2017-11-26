package cn.zxl.singletonpattern;

public class SinglrtonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }

}
