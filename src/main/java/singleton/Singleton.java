package singleton;

import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.locks.Lock;

/**
 * @author: yyWang
 * @create: 2019/10/10
 * @description: 单利模式，保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * 通常我们可以让一个全局变量使得一个对象被访问，但它不能防止你实例化多个对象，
 * 一个最好的方法就是，让类自身负责保存它的唯一实例，这个类可以保证没有其他实例可以被
 * 创建，并且它可以提供一个访问该实例的方法
 */

// 该类不能被继承和重写
public final class Singleton {

    // 由于这种静态初始化的方式是在自己被加载时就将自己实例化，所以被形象地称为饿汉式 单例类
    private static final Singleton instance = new Singleton();

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
