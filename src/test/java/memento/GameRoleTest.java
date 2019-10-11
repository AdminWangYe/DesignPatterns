package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameRoleTest {

    // 角色状态备份类
    @Test
    void saveState() {
        // 大战 Boss 前
        GameRole role = new GameRole();
        role.getInitState();
        role.stateDisplay();

        // 保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());

        // 大战 boss ，状态数据改变
        role.fightBoss();
        role.stateDisplay();

        // 恢复之前状态
        role.recoveryState(caretaker.getMemento());
        role.stateDisplay();
    }
}