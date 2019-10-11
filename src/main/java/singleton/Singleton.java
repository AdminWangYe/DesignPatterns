package singleton;

import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.locks.Lock;

/**
 * @author: yyWang
 * @create: 2019/10/10
 * @description: 单利模式，保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * 通常我们可以让一个全局变量使得一个对象被访问，但它不能防止你实例化多个对象，
 * 一个最好的方法就是，让类自身负责保存它的唯一实例，这个类可以保证没有其他实例可以被
 * 创建，并且它可以提供一个访问该实例的方法。
 * 单例模式实现由两种方式：一种是懒汉式，另一种是饿汉式。
 * 懒汉式是典型的时间换空间。每次获取实例都会进行判断，浪费判断的时间。
 * 饿汉式，是典型的时间换空间，不管是否实现，都创建出来。节省了运行时间。
 * 线程安全：
 * 不加同步的懒汉式是线程不安全的
 * 饿汉式是线程安全的，因为虚拟机保证了只会装载一次，在装载类的时候是不会发生并发的
 */

// 该类不能被继承和重写
public class Singleton {

    // 由于这种静态初始化的方式是在自己被加载时就将自己实例化，所以被形象地称为饿汉式 单例类
    // 饿汉模式天生是线程安全的，使用时没有延迟，
    // 缺点是启动时即创建实例，启动慢，有可能造成资源浪费
    private static Singleton instance = new Singleton();

    // 私有构造方法
    private Singleton() {
    }

    /**
     * 此方法是获得奔雷实例的唯一全局访问点
     *
     * @return 返回实例
     */
    public static Singleton getInstance() {
        return instance;
    }
}
