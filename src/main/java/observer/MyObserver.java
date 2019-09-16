package observer;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 抽象通知者接口
 */

public abstract class MyObserver {
    protected String name;
    protected Subject subject;

    public MyObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
