package signal;

/**
 * 懒加载
 */
public class Singleton {


    //保证对象实例化过程的顺序性
    private static volatile  Singleton instance = null;

    //其他的类无法实例化单例类的对象
    private Singleton() {
    }

    /**
     * 懒加载不浪费内存，但是无法保证线程的安全。
     * 首先，if判断以及其内存执行代码是非原子性的。
     * 其次，new Singleton()无法保证执行的顺序性。
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static synchronized Singleton getInstanceSafe() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }
}
