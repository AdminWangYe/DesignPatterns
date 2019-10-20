package responsibility;

/**
 * @author: yyWang
 * @create: 2019/10/12
 * @description: 管理者
 * 职责链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系，
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 接受者和发送者都没有对方的明确信息，且链中的对象自己也并不知道链的结构。
 * 结果是职责链可简化对象的相互连接，它们仅需保持一个指向其后继者的引用，而不需保持它所有的候选
 * 接受者的引用。
 */

public abstract class Manager {

    // 管理者的级别
    protected String name;

    // 管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 设置管理者的上级,关键方法
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);


}
