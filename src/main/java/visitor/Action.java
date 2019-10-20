package visitor;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 男人和女人对于同一个状态类
 */

public abstract class Action {
    // 得到男人和女人的结论或反映
    public abstract void getManConclusion(Man conclusion);

    public abstract void getWomanConclusion(Woman conclusion);
}
