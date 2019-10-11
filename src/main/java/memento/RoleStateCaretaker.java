package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 角色状态管理类
 */

public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
