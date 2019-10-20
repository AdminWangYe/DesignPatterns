package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description:
 */

public class Man extends Person {


    @Override
    public void accept(Action visit) {
        // 双分派技术：
        // 首先 在客户端程序中，将具体状态作为参数传递给男人 类完成一次分派，
        // 然后男人 类调用作为参数的具体状态中的方法，男人反应，同时将 自己作为参数传递进去，这便
        // 完成了第二次分派
        visit.getManConclusion(this);
    }
}
