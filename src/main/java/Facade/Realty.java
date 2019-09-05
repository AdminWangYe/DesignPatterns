package Facade;

/**
 * @author: yyWang
 * @create: 2019/9/5
 * @description: 房地产
 */

public class Realty {
    private String name;

    public Realty(String name) {
        this.name = name;
    }

    public void buyRealty() {
        System.out.println("购买" + this.name + "房地产");
    }

    public void sellRealty() {
        System.out.println("卖出" + this.name + "房地产");
    }
}
