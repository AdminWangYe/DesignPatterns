package SimpleFactory.Factor;

/**
 * @author: yyWang
 * @create: 2019/8/5
 * @description: 实现一个简单的加减乘除运算类，使用简单工厂模式
 */

public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     *  计算两个数运算的结果
     * @return
     */
    public abstract double getResult() throws Exception;
}
