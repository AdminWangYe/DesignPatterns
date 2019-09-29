package adapter.impl;

/**
 * @author: yyWang
 * @create: 2019/9/29
 * @description: 前锋
 */

public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {

        System.out.println(name + "前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + " 前锋防守");

    }
}
