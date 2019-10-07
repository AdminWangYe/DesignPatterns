package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 管理者类
 */

public class Caretaker {
    private Memento memento;

    // 得到或设置备忘录
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
