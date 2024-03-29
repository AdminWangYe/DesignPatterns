package decorator;

import decorator.implement.Human;
import decorator.implement.Jeans;
import decorator.implement.Orc;
import decorator.implement.Tshirts;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 测试服装类，测试装饰模式
 */
class DecoratorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void decorate() {

        Human man = new Human("小明");
        Orc orc = new Orc("小王");
        Jeans jeans = new Jeans();
        Tshirts tshirts = new Tshirts();

        jeans.decorate(man);
        tshirts.decorate(jeans);
        tshirts.showOwn();

        tshirts.decorate(orc);
        jeans.decorate(tshirts);
        jeans.showOwn();

    }
}