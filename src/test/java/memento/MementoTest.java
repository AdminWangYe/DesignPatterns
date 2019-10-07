package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    /**
     * 备忘录测试类
     */
    @Test
    void getState() {
        Originator originator = new Originator();
        // 初始状态
        originator.setState("On");
        originator.showData();

        Caretaker caretaker = new Caretaker();
        // 保存状态，可以隐藏 originator 的实现细节
        caretaker.setMemento(originator.createMemento());

        // 更改状态
        originator.setState("Off");
        originator.showData();

        // 恢复初始状态
        originator.setMemento(caretaker.getMemento());
        originator.showData();
    }
}