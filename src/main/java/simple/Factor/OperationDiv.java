package simple.Factor;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 除法操作
 */

public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if (super.getNumberB() == 0) {
            throw new Exception("除数不能为0");
        }
        return super.getNumberA() / super.getNumberB();
    }
}
