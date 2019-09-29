package observer.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yyWang
 * @create: 2019/9/21
 * @description: 事件的处理者
 */

public class EventHandler {

    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<>();
    }

    // 添加某个对象要执行的事件，及需要的参数
    public void addEvent(Object object, String method) {
        objects.add(new Event(object, method));
    }

    // 通知所有的对象执行指定的事件
    public void notifyX() throws Exception {
        for (Event event : objects) {
            event.invoke();
        }
    }
}
