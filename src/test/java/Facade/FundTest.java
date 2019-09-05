package Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTest {

    @Test
    void methodA() {
        Fund fund = new Fund();
        fund.methodA();
        fund.methodB();
    }
}