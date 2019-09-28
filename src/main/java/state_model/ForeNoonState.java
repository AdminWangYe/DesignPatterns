package state_model;

import state_model.impl.State;

/**
 * @author: yyWang
 * @create: 2019/9/28
 * @description: 上午状态
 */

public class ForeNoonState extends State {
    @Override
    public void handle(Work context) {
        if (context.getHour() < 12) {
            System.out.println(String.format("当前时间：%f点上午，工作精神百倍，", context.getHour()));
        } else {
            // 超过12点，则转入中午工作状态
            context.setState(new NoonState());
            context.handle();
        }
    }
}
