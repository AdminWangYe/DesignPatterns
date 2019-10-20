package mediator;

/**
 * @author: yyWang
 * @create: 2019/10/16
 * @description: 联合国安全理事会，相当于 ConcreteMediator 类
 */

public class UnitedSecurityCouncil extends UnitedNations {

    private USA colleague1;
    private Iraq colleague2;

    // 联合国安理会 了解所有的国家，所以拥有美国和伊拉克的对象属性
    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    // 重新了 声明的方法，实现了两个对象间的通信
    @Override
    public void declare(String message, Country colleague) {
        if (colleague1 == colleague) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
