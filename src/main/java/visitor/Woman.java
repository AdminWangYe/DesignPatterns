package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description:
 */

public class Woman extends Person {

    @Override
    public void accept(Action visit) {
        visit.getWomanConclusion(this);
    }
}
