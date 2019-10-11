package singleton;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: 单例模式，懒加载方式实现
 */

public class Singleton1 {

    // 对保存实例的变量添加 volatile 的修饰
    private volatile static Singleton1 instance = null;

    private Singleton1() {
    }

    // 该方式的优点是，懒加载，线程安全。实例必须有 volatile 关键字修饰，其保证初始化安全
    public static Singleton1 getInstance() {
        // 先检查实例是否存在，如果不存在就进入下面的同步块
        if (instance == null) {
            synchronized (Singleton1.class) {
                // 再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new Singleton1();
                }
            }

        }
        return instance;
    }
}
