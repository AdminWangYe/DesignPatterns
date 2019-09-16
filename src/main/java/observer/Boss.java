package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 具体的通知者类，可能是前台，也有可能是老板
 */

public class Boss implements Subject {

    // 需要被通知的人
    private List<MyObserver> observers = new ArrayList<>();
    private String action;

    // 添加
    @Override
    public void attach(MyObserver observer) {

        observers.add(observer);
    }

    // 移除
    @Override
    public void detach(MyObserver observer) {

        observers.remove(observer);
    }

    //    通知
    @Override
    public void notifies() {
        for (MyObserver observer : observers) {
            observer.update();
        }
    }

    // 设置老板的状态
    @Override
    public void setSubjectState(String action) {

        this.action = action;
    }

    @Override
    public String getSubjectState() {
        return action;
    }
}

