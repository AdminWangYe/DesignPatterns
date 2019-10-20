package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectiveStructureTest {

    @Test
    void display() {

        ObjectiveStructure o = new ObjectiveStructure();
        // 添加要对比的 男人和女人
        o.attach(new Man());
        o.attach(new Woman());

        Success v1 = new Success();
        o.display(v1);

        o.display(new Failing());

    }
}