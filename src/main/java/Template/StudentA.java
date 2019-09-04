package Template;

/**
 * @author: yyWang
 * @create: 2019/9/4
 * @description: 子类实现父类中抽象的方法
 */

public class StudentA extends TestPaper {
    @Override
    public String answerQuestion1() {
        return "A";
    }

    @Override
    public String answerQuestion2() {
        return "B";
    }

    @Override
    public String answerQuestion3() {
        return "D";
    }
}
