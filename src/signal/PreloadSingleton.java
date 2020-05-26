package signal;

/**
 * 预加载
 * 牺牲空间
 * 线程安全
 */
public class PreloadSingleton {
    public static PreloadSingleton instance = new PreloadSingleton();

    /**
     * 其他的类无法实例化单例类的对象
     */
    private PreloadSingleton() {
    }

    public static PreloadSingleton getInstance() {
        return instance;
    }


}
