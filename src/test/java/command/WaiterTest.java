package command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest {

    @Test
    void notifies() {

        // 开店前的准备
        Barbecue boy = new Barbecue();
        Command command1 = new BakeMuttonCommand(boy);
        Command command2 = new BakeMuttonCommand(boy);
        Command command3 = new BakeChickenCommand(boy);

        Waiter girl = new Waiter();

        // 开门营业
        girl.setOrder(command1);
        girl.setOrder(command2);
        girl.setOrder(command3);

        girl.cancelOrder(command2);
        // 点菜完毕，通知厨房
        girl.notifies();

    }
}