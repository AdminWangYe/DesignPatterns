package simple.Factor;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 减法操作
 */

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return super.getNumberA() - super.getNumberB();
    }
}
