package cn.zxl.singletonpattern;

public class LazySafe {
    private static LazySafe safe;
    private LazySafe(){
    }
    public static synchronized LazySafe getSafe(){
        if (safe == null){
            safe = new LazySafe();
        }
        return safe;
    }
}
