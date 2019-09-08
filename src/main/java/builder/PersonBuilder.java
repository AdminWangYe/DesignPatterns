package builder;

import java.security.KeyStore.Builder;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 建造者模式，又叫做生成器模式，将一个复杂对象的构建与它的表示分离，使得同样的构造过程可以创建不同的表示
 * 如果我们用了建造者模式，那么用户只需要指定需要建造的类型就可以得到它们，而具体建造的过程和细节就不需要知道。
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
