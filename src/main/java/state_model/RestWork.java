package state_model;

import state_model.impl.State;

/**
 * @author: yyWang
 * @create: 2019/9/28
 * @description: 下班状态
 */

public class RestWork extends State {
    @Override
    public void handle(Work context) {
        System.out.println(String.format("当前时间：%f 点，工作完成下班回家", context.getHour()));
    }
}
