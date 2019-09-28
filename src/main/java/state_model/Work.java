package state_model;

import state_model.impl.State;

/**
 * @author: yyWang
 * @create: 2019/9/26
 * @description: 状态模式，当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断
 * 逻辑转移到表示不同状态的一系列类中，可以把复杂的判断逻辑简化。
 * ---------------------------------
 * 状态的模式的好处：将与特定状态相关的行为局部化，并且将不同状态的行为分割开来。
 * 将特定的状态相关的行为，都放入一个对象中，由于所有与状态相关的代码都存在于某个 ConcreteState 中，
 * 所以通过定义新的子类可以很容易地增加新的状态和转换
 * 当一个对象的行为取决于它的状态，并且它必须运行时刻根据状态改变他的行为时，就可以考虑状态模式。
 */

public class Work {
    private State state;

    // 钟点属性，状态转换的依据
    private double hour;
    // 任务完成属性，是否能下班的依据
    private boolean finish;

    public Work() {
        // 工作初始化为上午工作状态，即9点开始上班
        state = new ForeNoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void handle() {
        state.handle(this);
    }
}
