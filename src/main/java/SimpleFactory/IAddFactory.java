package SimpleFactory;

import SimpleFactory.Factor.IFactory;
import SimpleFactory.Factor.Operation;
import SimpleFactory.Factor.OperationAdd;

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
