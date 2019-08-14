package SimpleFactory;

import SimpleFactory.Factor.*;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 简单工厂模式
 */

public class OperationFactory {

    /**
     * 根据传入的操作符，创建对应的对象
     * @param operation 操作符，进行加减运算
     * @return 返回对应的操作对象
     */
    public static Operation createOperate(String operation) {

        Operation operation1 = null;
        switch (operation) {
            case "+":
                operation1 = new OperationAdd();
                break;
            case "-":
                operation1 = new OperationSub();
                break;
            case "*":
                operation1 = new OperationMul();
                break;
            case "/":
                operation1 = new OperationDiv();
                break;
        }
        return operation1;
    }

}
