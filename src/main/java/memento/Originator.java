package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外
 * 保存这个状态，这样以后就可将该对象恢复到原先保存的状态。
 * 发起人类，需要备份状态
 */

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 恢复备忘录，将 Memento 导入并将相关数据恢复
     *
     * @param memento 备忘录数据
     */
    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    /**
     * 显示数据
     */
    public void showData() {
        System.out.println("state:" + state);
    }

}
