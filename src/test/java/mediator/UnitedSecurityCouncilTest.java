package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitedSecurityCouncilTest {

    @Test
    void declare() {

        UnitedSecurityCouncil UNSC = new UnitedSecurityCouncil();
        USA usa = new USA(UNSC);
        Iraq iraq = new Iraq(UNSC);

        UNSC.setColleague1(usa);
        UNSC.setColleague2(iraq);

        usa.declare("我是世界老大，我要对你使用核武器。。");
        iraq.declare("我不怕核武器，我人多");

    }
}