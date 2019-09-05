package Facade;

/**
 * @author: yyWang
 * @create: 2019/9/5
 * @description: 外观模式，为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用
 */

public class Fund {
    private NationalDebt nationalDebt;
    private Realty realty;
    private Stock stockA;
    private Stock stockB;

    /**
     * 外观类，它需要了解所有的子系统的方法或属性，进行组合，以备外界调用
     */
    public Fund() {
        nationalDebt = new NationalDebt("美国");
        realty = new Realty("万达");
        stockA = new Stock("平安");
        stockB = new Stock("招商");
    }

    public void methodA() {
        nationalDebt.bugND();
        realty.buyRealty();
        stockA.buyStock();
        stockB.buyStock();
    }

    public void methodB() {
        nationalDebt.sellND();
        realty.sellRealty();
        stockB.sellStock();
        stockA.sellStock();

    }
}
