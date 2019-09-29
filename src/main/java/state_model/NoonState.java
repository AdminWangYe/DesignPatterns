package state_model;

import state_model.impl.State;

/**
 * @author: yyWang
 * @create: 2019/9/28
 * @description: 正午状态
 *
 */

public class NoonState extends State {
    @Override
    public void handle(Work context) {
        if (context.getHour() < 13) {
            System.out.println(String.format("当前时间%f 点，饿了，吃午饭；犯困", context.getHour()));
        } else {
            // 超过13点，则转入下午工作状态
            context.setState(new AfterNoonState());
            context.handle();
        }
    }
}
