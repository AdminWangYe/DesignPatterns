package state_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkTest {

    @Test
    void handle() {
        // 紧急项目
        Work emerge = new Work();
        emerge.setHour(10);
        emerge.handle();

        emerge.setHour(14);
        emerge.setFinish(true);
        emerge.handle();
    }
}