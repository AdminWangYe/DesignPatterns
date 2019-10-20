package interpreter;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 音节类
 */

public class Scale extends Expression {
    @Override
    public void excuse(String playKey, double doublePlayValue) {
        String scale = "";

        //如果获得 key 是O 并且 value 是1 则演奏低音，2 则是中音等等

        if ((int) doublePlayValue == 1) {
            scale = "低音";
        } else if ((int) doublePlayValue == 2) {
            scale = "中音";
        } else if ((int) doublePlayValue == 3) {
            scale = "高音";
        }
        System.out.print(scale + " ");
    }
}
