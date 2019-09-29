package adapter;

import adapter.impl.ForeignCenter;
import adapter.impl.Player;

/**
 * @author: yyWang
 * @create: 2019/9/29
 * @description: 适配器模式，将一个类的接口转换成客户希望的另外一个接口，Adapter 模式使得原本由于接口不兼容
 * 而不能一起工作的那些类可以一起工作。
 * 适配器主要有两种类型：1.类适配器模式，2.对象适配器模式
 * 由于类适配器模式通过多重继承对一个接口与另一个接口进行匹配，但面向对象语言都不支持多重继承（C++除外）
 * 所以目前大部分使用的是对象适配。
 */

public class Translator extends Player {

    private ForeignCenter foreign = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreign.setName(name);
    }


    @Override
    public void attack() {
        foreign.chineseAttack();
    }

    @Override
    public void defense() {
        foreign.chineseDefender();
    }
}
