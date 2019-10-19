package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 实现 Flyweight 接口，并为内部状态增加存储空间
 */

public class ConcreteFlyweight extends Flyweight {

    private String name = "";

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    public ConcreteFlyweight() {
    }

    @Override
    public void operation(int extricate) {
        System.out.println("具体的Flyweight:" + extricate);
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
