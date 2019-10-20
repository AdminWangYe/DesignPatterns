package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description:
 */

public class Success extends Action {
    @Override
    public void getManConclusion(Man conclusion) {
        // 使用 getClass().getName 获取当前类的类名
        System.out.println(conclusion.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + ",背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman conclusion) {

        System.out.println(conclusion.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + ",背后多半有一个不成功的男人");
    }
}
