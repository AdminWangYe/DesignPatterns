package decorator.implement;

import decorator.Decorator;

/**
 * @author: yyWang
 * @create: 2019/8/1
 * @description: 牛仔裤
 */

public class Jeans extends Decorator {
    public void showOwn() {
        System.out.println("牛仔裤");
        super.showOwn();
    }
}
