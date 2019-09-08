package simple;

import simple.Factor.*;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 简单工厂模式 VS  工厂模式
 * 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件，动态实例化相关的类，对于客户端来说
 * 去除了于具体产品的依赖。
 * 工厂方法模式，是定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
 * 如果现在需要添加新的功能，对于简单工厂模式，就要在工厂类里添加一个分支条件，这就违背了 开放-封闭原则。
 * 而工厂模式克服了简单工厂违背开放-封闭原则的缺点，又保持了封装对象创建过程的优点。
 * 工厂模式是简单工厂模式的进一步抽象和推广。
 *
 *
 */

public class OperationFactory {

    /**
     * 根据传入的操作符，创建对应的对象
     *
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

    /**
     *  用于测试工厂模式的方法
     * @param args 主函数运行的方法
     */
    public static void main(String[] args) throws Exception {
        // 需要什么运算就创建什么样的工厂子类。后期可以用反射 解决避免分支判断的问题。
        IFactory add = new IAddFactory();
        Operation addOperation = add.createFactory();
        addOperation.setNumberB(10);
        addOperation.setNumberA(12.1);
        System.out.println(addOperation.getResult());

    }
}
