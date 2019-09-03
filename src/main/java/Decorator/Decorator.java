package Decorator;

import Decorator.implement.Character;

/**
 * @author: yyWang
 * @create: 2019/7/30
 * @description: 服饰类, 装饰的过程就是一条链表，装饰模式是为已有的功能动态添加更多功能的一种方式，
 * 当系统需要新的功能的时候，是向旧的类中添加新的代码，这些新加的代码通常装饰了原有类的核心职责或主要行为
 * 装饰模式的优点：把类的核心功能从类中搬移去除，这样可以简化原有的类。
 * 有效地把类的核心职责和装饰功能区分开了，而且还可以去除相关类中重复的装饰类
 */

public class Decorator extends Character {

    protected Character component = null;

    public void decorate(Character component) {

        this.component = component;
    }


    @Override
    public void showOwn() {
        if (component != null) {
            this.component.showOwn();
        }
    }
}
