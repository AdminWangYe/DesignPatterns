package observer;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 观察者模式，subject 类，它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者，
 * 抽象主题提供一个接口，可以增加和删除观察者对象。
 * 观察者模式，定义了一种一对多的依赖关系，让多个观察者对象同时监听一个主题对象，这个主题对象在状态发生变化时，会通知所有
 * 观察者对象，使它们能够自动更新自己。
 * subject 类：可以理解为主题或者通知者，一般用一个抽象类或者一个接口实现。它把所有对观察者对象的引用保存在一个聚集里，
 * 每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象。
 * 观察者模式的动机是：将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间的一致性，我们不
 * 希望为了维持一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。
 * 观察者模式的关键对象是主题subject 和观察者observe，一个subject可以有任意数目的依赖他的observer ，一旦subject 的状态
 * 发生了改变，所有的observer 都可以得到通知。
 * ==================================================================
 * 何时使用：
 * 当一个对象的改变需要同时改变其他对象的时候。而且它不知道具体有多少对象有待改变时，可以考虑使用观察者模式；
 * 一个抽象模型有两个方面，其中一方面依赖于另一方面，这时用观察者模式可以将这两者封装在独立的对象中使它们各自地
 * 独立地改变和复用。
 * ---------------------------------------------------------------------
 * 观察者模式其实就是在解耦合，让耦合的双方都依赖与抽象，而不依赖于具体，从而使得各自的变化都不会影响另一边的变化。
 * 体现了依赖倒转的原则
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
