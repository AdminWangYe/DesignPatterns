package Decorator;

/**
 * @author: yyWang
 * @create: 2019/8/1
 * @description: 角色的抽象类
 */

public abstract class Character {
    protected String name;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public abstract void showOwn();
}
