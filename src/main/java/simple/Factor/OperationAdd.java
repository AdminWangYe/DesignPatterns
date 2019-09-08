package simple.Factor;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 加法运算
 */

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }
}

