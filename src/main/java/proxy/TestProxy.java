package proxy;

import proxy.Imple.SchoolGirl;

/**
 * @author: yyWang
 * @create: 2019/8/14
 * @description: 测试 代理模式
 */

public class TestProxy {
    public static void main(String[] args) {
        SchoolGirl meinv = new SchoolGirl();
        meinv.setName("小姐姐");

        Proxy daili = new Proxy(meinv);

        daili.GiveChocolate();
        daili.GiveDolls();
        daili.GiveFlowers();
    }
}
