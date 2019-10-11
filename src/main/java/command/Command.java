package command;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: 抽象命令
 * 命令模式：将一个请求封装为一个对象，从而是你可用不同的请求对客户进行参数化，
 * 对请求排队或记录请求日志，以支持可撤销的操作。
 * 命令模式的优点：第一，它能较容易地设计一个命令队列，
 * 第二，在需要的情况下，可以较容易地将命令添加到日志中。
 * 第三，允许接收请求的一方决定是否要否决请求。
 * 第四，可以容易地实现对请求的撤销和重做。
 * 第五，由于加进新的具体命令类不影响其他的类，因此增加新的具体命令类很容易
 * 命令模式把请求一个操作的对象与知道怎么执行一个操作的对象分隔开。
 */

public abstract class Command {

    protected Barbecue receiver;

    public Command(Barbecue receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();


}
