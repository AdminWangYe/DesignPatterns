package adapter.impl;

/**
 * @author: yyWang
 * @create: 2019/9/29
 * @description: 外籍中锋
 */

public class ForeignCenter {

    private String name;

    public void chineseAttack() {
        System.out.println("外籍中锋 " + name + "进攻。。");
    }

    public void chineseDefender() {
        System.out.println("外籍中锋 " + name + "防守。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
