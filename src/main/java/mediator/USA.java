package mediator;

/**
 * @author: yyWang
 * @create: 2019/10/16
 * @description: 美国类，相当于 ConcreteColleague
 */

public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    // 声明
    public void declare(String message) {
        mediator.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println(String.format("美国获得对方消息：%s", message));
    }

}
