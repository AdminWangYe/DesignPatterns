package SimpleFactory;

import SimpleFactory.Factor.Operation;
import org.junit.jupiter.api.Test;

class OperationFactoryTest {

    Operation operation = null;

    @Test
    void createOperate() throws Exception {
        // 测试加法运算
        double num1 = 9;
        double num2 = 0;
        String op = "/";
        operation = OperationFactory.createOperate(op);
        operation.setNumberA(num1);
        operation.setNumberB(num2);
        System.out.println(operation.getResult());
    }
}