package facade;

/**
 * @author: yyWang
 * @create: 2019/9/5
 * @description: 外观模式，为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 * 这个接口使得这一子系统更加容易使用.
 * 外观模式何时使用：
 * 第一，首先在设计初期阶段，应该有意识的将不同的两个层分离，比如经典的三层架构，数据访问层，业务逻辑层，表示层
 * 这时就需要考虑层与层之间建立外观 Facade.。这样就可以大大降低系统的耦合度。
 * 第二，在开发阶段，子系统往往因为不断的重构演化二变的原来越复杂，增加外观 Facade 可以提供一个简单的接口，减少他们之间的依赖。
 * 第三，在维护一个遗留的大型系统时，可能这个系统已经非常难以维护和扩展，可以添加外观 Facade ，来提供设计粗糙或高度复杂的遗留
 * 代码的比较清晰简单的接口，让新系统与 Facade 对象交互，Facade 与遗留代码交互所有复杂的工作。
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
        System.out.println("===========基金操作方法A==============");
        nationalDebt.bugND();
        realty.buyRealty();
        stockA.buyStock();
        stockB.buyStock();
        System.out.println("======================================");
    }

    public void methodB() {
        System.out.println("===========基金操作方法B==============");
        nationalDebt.sellND();
        realty.sellRealty();
        stockB.sellStock();
        stockA.sellStock();
        System.out.println("======================================");

    }
}
