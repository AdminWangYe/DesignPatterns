package mediator;

/**
 * @author: yyWang
 * @create: 2019/10/16
 * @description: 联合国机构 相当于 Mediator 类
 * 中介者模式：
 * 优点：Mediator 的出现减少了 各个 Colleague 的耦合，使得可以独立地改变和复用各个 Colleague 类和 Mediator
 * 由于把对象如何协作进行了抽象，将中介作为一个独立的概念并将其封装在一个对象中。这样关注的对象就从
 * 对象各自本身的行为转移到它们之间的交互上来。
 * 但 由于 ConcreteMediator 控制了集中化，于是就把交互复杂性变为了中介者的复杂性，这就使得中介者会变的
 * 比任何一个 ConcreteColleague 都复杂。
 * 中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合，以及想定制一个分布在多个类中的行为，
 * 而又不想生成太多的子类的场合。
 */

public abstract class UnitedNations {

    public abstract void declare(String message, Country colleague);

}
