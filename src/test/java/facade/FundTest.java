package facade;

import org.junit.jupiter.api.Test;

class FundTest {

    @Test
    void methodA() {
        Fund fund = new Fund();
        fund.methodA();
        fund.methodB();
    }
}