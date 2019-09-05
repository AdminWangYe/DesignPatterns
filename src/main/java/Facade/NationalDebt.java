package Facade;

/**
 * @author: yyWang
 * @create: 2019/9/5
 * @description: 国债
 */

public class NationalDebt {
    private String name;

    public NationalDebt(String name) {
        this.name = name;
    }

    public void bugND() {
        System.out.println("购买" + this.name + "债券");
    }

    public void sellND() {
        System.out.println("卖出" + this.name + "债券");
    }
}
