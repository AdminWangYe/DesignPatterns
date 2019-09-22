package observer.event;


/**
 * @author: yyWang
 * @create: 2019/9/20
 * @description: 通知者
 * 委托就是一种引用方法的类型。一旦为委托分配了方法，委托将与该方法具有完全相同的行为，委托方法的使用可以像其他任何方法一样，具有参数和返回值。
 * 一个委托可以搭载多个方法，所有方法被依次唤起。而且可以使得委托对象所搭载的方法并不需要属于同一个类。
 * 委托也有前提，那就是委托对象所搭载的所有的方法，必须拥有相同的原形和形式，也就是拥有相同的参数列表和返回值类型。
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
