package cn.zxl.singletonpattern;

/**
 * 线程不安全
 * 没有synchronized，严格意义上不算单例模式
 */
public class Lazy {
    private static Lazy lazy;
    private Lazy(){}
    public static Lazy getLazy(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
