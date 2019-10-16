package mediator;

/**
 * @author: yyWang
 * @create: 2019/10/16
 * @description: 伊拉克类，相当于 ConcreteColleague2类
 */

public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }

    // 声明
    public void declare(String message) {
        mediator.declare(message, this);
    }
}
