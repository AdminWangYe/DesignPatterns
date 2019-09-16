package observer;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 观察者模式，subject 类，它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者，抽象
 * 主题提供一个接口，可以增加和删除观察者对象。
 */

public interface Subject {

    // 添加需要通知的人
    void attach(MyObserver observer);

    // 移除通知的人
    void detach(MyObserver observer);

    // 通知行为
    void notifies();

    // 设置通知者的状态
    void setSubjectState(String action);

    // 获得通知者的状态
    String getSubjectState();
}
