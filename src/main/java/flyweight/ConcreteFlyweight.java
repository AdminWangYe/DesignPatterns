package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 实现 Flyweight 接口，并为内部状态增加存储空间
 */

public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extricate) {
        System.out.println("具体的Flyweight:" + extricate);
    }
}
