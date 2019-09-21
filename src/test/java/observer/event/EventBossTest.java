package observer.event;

import java.util.Date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventBossTest {

    @Test
    void notifyObservers() {
        EventBoss boss = new EventBoss();
        EventStockObserver stock = new EventStockObserver("小李", boss);
        EventNBAObserver nb = new EventNBAObserver("小张", boss);
        boss.addListener(nb, "closeNBADirectSeeding");
        boss.addListener(stock, "closeStockMarket");

        boss.setSubjectStatus("我胡汉三又回来了");
        boss.notifyX();


    }
}