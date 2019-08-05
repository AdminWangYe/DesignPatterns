package Decorator.implement;

import Decorator.Decorator;
import Decorator.implement.Character;

/**
 * @author: yyWang
 * @create: 2019/8/1
 * @description: 兽人角色
 */

public class Orc extends Character {

    public Orc(String name) {
        super(name);
    }

    @Override
    public void showOwn() {
        System.out.println(this.name + "展示");
    }


}
