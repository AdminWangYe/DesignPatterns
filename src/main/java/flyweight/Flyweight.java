package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 享元模式：
 * 运用共享技术有效地支持大量细粒度的对象。
 * Flyweight 类：它是所有具体享元类的超类或接口。通过这个接口，Flyweight 可以接受并作用于
 * 外部状态。
 */

public abstract class Flyweight {
    public abstract void operation(int extricate);
}
