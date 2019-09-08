package decorator.implement;

import decorator.Decorator;

/**
 * @author: yyWang
 * @create: 2019/8/1
 * @description: 具体服装类，T恤
 */

public class Tshirts extends Decorator {

    public void showOwn() {
        System.out.println("T恤");
        super.showOwn();
    }
}
