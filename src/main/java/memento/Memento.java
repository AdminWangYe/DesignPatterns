package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 备忘录类
 * 备忘录模式：一般适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性
 * 只是众多属性中的一小部分时，Originator 可以根据保存的 Memento 信息还原到前一状态。
 */

public class Memento {

    private String state;

    // 将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
