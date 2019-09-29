package observer.event;


/**
 * 通知者的抽象类
 */
public abstract class EventSubject {
    private EventHandler eventHandler = new EventHandler();

    // 设置老板的状态
    protected String subjectStatus;


    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 增加需要帮忙放哨的学生
     *
     * @param object     要执行方法的对象
     * @param methodName 执行方法的方法名
     */
    public abstract void addListener(Object object, String methodName);

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public abstract void setSubjectStatus(String subjectStatus);

    /**
     * 通知订阅者消息
     */
    public abstract void notifyX();
}
