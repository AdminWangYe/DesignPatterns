package builder;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 建造者模式，又叫做生成器模式，将一个复杂对象的构建与它的表示分离，使得同样的构造过程可以创建不同的表示
 * 如果我们用了建造者模式，那么用户只需要指定需要建造的类型就可以得到它们，而具体建造的过程和细节就不需要知道。
 * 建造者模式是逐步建造产品的，所以建造者的 builder 类里的那些建造方法必须要足够普遍，以便为各种类型的具体建造者构造。
 * <p>
 * 建造者模式，主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象内部的构造通常面临着复杂的变化
 * 建造模式的优点是：使得建造者代码与表示代码分离，由于建造者隐蔽了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要
 * 再定义一个具体的建造者就可以了。
 * 建造者模式是当创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式
 */

public abstract class PersonBuilder {

    protected String name;

    public PersonBuilder(String name) {
        this.name = name;
    }

    /**
     * 流水线创建一个人的方法，
     */
    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();

}
