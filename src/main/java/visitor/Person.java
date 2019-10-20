package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description:
 */

public abstract class Person {

    protected String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    // 他用来获取状态 对象的
    public abstract void accept(Action visit);

}
