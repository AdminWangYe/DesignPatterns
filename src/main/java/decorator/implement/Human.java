package decorator.implement;

/**
 * @author: yyWang
 * @create: 2019/7/30
 * @description: 设计模式，装饰模式,使用人穿衣打扮，进行解释装饰模式
 */

public class Human extends Character {


    public Human(String personName) {
        super(personName);
    }

    @Override
    public void showOwn() {
        System.out.println(this.name + "展示：");
    }


}
