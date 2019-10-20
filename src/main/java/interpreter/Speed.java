package interpreter;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 控制 演奏速度
 */

public class Speed extends Expression {
    @Override
    public void excuse(String playKey, double doublePlayValue) {

        String speed = "";
        if (doublePlayValue < 500) {
            speed = "快速";
        } else if (doublePlayValue >= 1000) {
            speed = "慢速";
        } else {
            speed = " 中速";
        }
        System.out.print(speed + " ");
    }
}
