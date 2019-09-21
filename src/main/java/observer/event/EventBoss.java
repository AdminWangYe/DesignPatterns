package observer.event;


/**
 * @author: yyWang
 * @create: 2019/9/20
 * @description:
 */

public class EventBoss extends EventSubject {


    @Override
    public void addListener(Object object, String methodName) {
        EventHandler handler = this.getEventHandler();
        handler.addEvent(object, methodName);
    }


    /**
     * 设置老板的状态
     *
     * @param subjectStatus 老板的行为
     */
    @Override
    public void setSubjectStatus(String subjectStatus) {
        super.subjectStatus = subjectStatus;
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的职员，告诉所有需要通知的人，老板来了。。");

        try {
            EventHandler handler = this.getEventHandler();
            handler.notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
