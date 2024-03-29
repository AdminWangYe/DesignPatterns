package singleton;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: holder 模式，改成内部类，由 jvm 保证线程安全性
 */

public class Singleton2 {

    /**
     * 类级的内部类。也就是静态的成员式内部类，该内部类的实例与外部类的
     * 实例没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        // 静态初始化器，由jvm 来保证线程安全
        private static Singleton2 instance = new Singleton2();
    }

    private Singleton2() {
    }

    // 将懒加载和线程安全完美结合的一种方式（无锁）。推荐
    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
