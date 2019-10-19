package flyweight;

import java.util.Hashtable;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 该类是一个享元工厂，用来创建并管理Flyweight 对象，它主要用来确保合理
 * 地共享 Flyweight ，当用户 请求一个Flyweight 时，FlyweightFactory 对象提供一个已创建实例
 * 或创建一个（如果不存在的话）。
 */

public class FlyweightFactory {
    private Hashtable<String, ConcreteFlyweight> flyweights = new Hashtable<>();

    // 初始化工厂时，先生成三个实例
    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    // 根据客户端请求，获得已生成的实例
    public Flyweight getFlyweights(String key) {
        return flyweights.get(key);
    }
}
