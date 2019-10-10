package composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandsetBrandTest {

    @Test
    void brandRun() {
        // 聚合/合成 原则模式测试
        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setSoft(new HandsetGame());
        ab.brandRun();
    }
}