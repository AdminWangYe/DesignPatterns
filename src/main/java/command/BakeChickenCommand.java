package command;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: 烤鸡翅命令
 */

public class BakeChickenCommand extends Command {
    public BakeChickenCommand(Barbecue receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChicken();

    }


    @Override
    public String toString() {
        return "命令模式.烤鸡翅";
    }
}
