package adapter.impl;

/**
 * @author: yyWang
 * @create: 2019/9/29
 * @description: 中锋
 */

public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {

        System.out.println(name + "中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + " 中锋防守");

    }

}
