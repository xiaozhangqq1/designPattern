package cn.zxl.singletonpattern;

/**
 * 较常用，容易产生垃圾对象，没有加锁，执行效率会提高。类加载是就初始化，浪费内存。
 */
public class Hungry {
    public static Hungry instance = new Hungry();
    private Hungry(){
    }
    public static Hungry getInstance(){
        return instance;
    }
}
