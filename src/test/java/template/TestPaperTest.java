package template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 测试模板方法模式的模块测试
 */
class TestPaperTest {
    TestPaper test;
    TestPaper test1;

    @BeforeEach
    void setUp() {
        test = new StudentA();
        test1 = new StudentB();
    }

    @Test
    void testQuestion1() {
        test.testQuestion1();
        test1.testQuestion1();
    }

    @Test
    void testQuestion2() {
        test.testQuestion2();
        test1.testQuestion2();
    }

    @Test
    void testQuestion3() {
        test.testQuestion3();
        test1.testQuestion3();
    }
}