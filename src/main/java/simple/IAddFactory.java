package simple;

import simple.Factor.IFactory;
import simple.Factor.Operation;
import simple.Factor.OperationAdd;

/**
 * @author: yyWang
 * @create: 2019/8/15
 * @description: 工厂模式，加法运算，基础工厂接口
 */

public class IAddFactory implements IFactory {
    @Override
    public Operation createFactory() {
        return new OperationAdd();
    }
}
