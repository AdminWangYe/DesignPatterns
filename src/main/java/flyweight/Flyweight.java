package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 享元模式：
 * 运用共享技术有效地支持大量细粒度的对象。
 * Flyweight 类：它是所有具体享元类的超类或接口。通过这个接口，Flyweight 可以接受并作用于
 * 外部状态。
 * <p>
 * 在享元对象内部并且不会随环境改变而改变的共享部分，可以称为是享元对象的内部状态。
 * 而随环境改变而改变的，不可以共享的状态就是外部状态了。
 * 享元模式 Flyweight 执行时所需的状态是有内部的也可能有外部的。内部状态存储于 ConcreteFlyweight 对象之中。
 * 而外部对象则应该考虑客户端对象存储或计算。当调用 Flyweight 对象的操作。将该状态传递给它
 */

public abstract class Flyweight {
    public abstract void operation(int extricate);

    public abstract void use();
}
