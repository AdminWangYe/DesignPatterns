package facade;

/**
 * @author: yyWang
 * @create: 2019/9/5
 * @description: 股票类，股票购买操作
 */

public class Stock {

    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public void buyStock() {
        System.out.println("购买" + this.name + "股票");
    }

    public void sellStock() {
        System.out.println("卖出" + this.name + "股票");
    }
}
