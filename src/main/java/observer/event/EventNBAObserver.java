package observer.event;

/**
 * @author: yyWang
 * @create: 2019/9/20
 * @description:
 */

public class EventNBAObserver {

    private String name;
    private EventSubject sub;

    public EventNBAObserver(String name, EventSubject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void closeNBADirectSeeding() {
        System.out.println(sub.getSubjectStatus() + "," + name + "关闭NBA直播，继续工作");
    }
}
