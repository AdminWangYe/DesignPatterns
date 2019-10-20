package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 访问者模式，表示一个作用于某对象结构中的各元素的操作，
 * 它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 * 访问者模式适用于数据结构相对稳定的系统。它的数据结构和作用于结构上的操作
 * 之间的耦合解脱开，使得操作集合可以相对自由地演化。
 * 访问者模式的目的是要把处理从数据结构分离出来。
 * 访问者模式使得算法操作的增加变的容易，访问者模式将有关的行为集中到一个访问者对象中。
 * 缺点是，使增加新的数据结构变的困难。
 */

public abstract class Person {

    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    // 他用来获取状态 对象的
    public abstract void accept(Action visit);

}
