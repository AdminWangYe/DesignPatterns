package adapter.impl;

/**
 * @author: yyWang
 * @create: 2019/9/29
 * @description: 篮球实例，师兄适配器模式
 */

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    // 篮球运动员进攻和防守方法
    public abstract void attack();

    public abstract void defense();

}
