package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description:
 */

public class Failing extends Action {
    @Override
    public void getManConclusion(Man conclusion) {
        System.out.println(conclusion.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + ",闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman conclusion) {
        System.out.println(conclusion.getClass().getSimpleName() + " " + this.getClass().getSimpleName() + ",眼泪汪汪，谁也劝不了。");

    }
}
