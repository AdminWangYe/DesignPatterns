package command;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: yyWang
 * @create: 2019/10/11
 * @description: 服务员
 */

public class Waiter {
    // 存放命令的容器
    private List<Command> orders = new ArrayList<>();

    public void setOrder(Command command) {
        if (command.toString().equals("命令模式.烤鸡翅")) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        }
    }

    public void cancelOrder(Command command) {
        // 取消订单
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    // 通知全部执行
    public void notifies() {
        for (Command c : orders) {
            c.executeCommand();
        }
    }
}
