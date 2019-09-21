package observer.event;

import javax.security.auth.Subject;

/**
 * @author: yyWang
 * @create: 2019/9/20
 * @description: 使用事件委托实现观察者模式
 */

public class EventStockObserver {
    private String name;
    private EventSubject sub;

    public EventStockObserver(String name, EventSubject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeStockMarket(){
        System.out.println(sub.getSubjectStatus()+","+name+"关闭股票行情，继续工作！");
    }
}
