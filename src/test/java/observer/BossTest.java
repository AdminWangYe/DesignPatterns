package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void notifies() {
        // 观察者
        Boss bos = new Boss();
        StockObserver stock = new StockObserver("小明", bos);
        NBAObserve nbaObserve = new NBAObserve("姚明", bos);

        // 添加通知的人呢
        bos.attach(stock);
        bos.attach(nbaObserve);

        // 设置老板的状态
        bos.setSubjectState("我胡汉三回来了！");

        // 移除一个通知者
        bos.detach(nbaObserve);

        // 通知其他人
        bos.notifies();
    }
}