package state_model.impl;

import state_model.Work;

/**
 * @author: yyWang
 * @create: 2019/9/26
 * @description: 抽象状态类，定义一个接口以封装与Context 的一个特定状态相关的行为
 */

public abstract class State {
    public abstract void handle(Work context);
}
