package observer;

/**
 * @author: yyWang
 * @create: 2019/9/16
 * @description: 看股票的同事，被通知类的具体实现类，
 */

public class StockObserver extends MyObserver {
    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSubjectState() + " " + name + " 关闭股票行情，继续工作");
    }
}
