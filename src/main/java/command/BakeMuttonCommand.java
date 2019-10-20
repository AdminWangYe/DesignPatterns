package command;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: 烤羊肉串儿 命令
 */

public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecue receiver) {
        super(receiver);
    }

    public void executeCommand() {
        receiver.bakeMutton();
    }

    @Override
    public String toString() {
        return "命令模式.烤羊肉串";
    }
}
