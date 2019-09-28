package state_model;

import state_model.impl.State;

/**
 * @author: yyWang
 * @create: 2019/9/28
 * @description: 下午状态
 */

public class AfterNoonState extends State {
    @Override
    public void handle(Work context) {
        if (context.isFinish()) {
            // 如果工作完成就转入下班状态
            context.setState(new RestWork());
            context.handle();
        } else {
            if (context.getHour() < 21) {
                System.out.println(String.format("当前时间是：%f 点，疲惫之极", context.getHour()));
            }
        }
    }
}
