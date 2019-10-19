package flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {

    @Test
    void operation() {
        // 代码外部状态
        int extrinsic = 22;
        FlyweightFactory flyweight1 = new FlyweightFactory();

        Flyweight f1 = flyweight1.getFlyweights("X");
        f1.operation(--extrinsic);

        Flyweight f2 = flyweight1.getFlyweights("Y");
        f2.operation(--extrinsic);

        Flyweight f3 = flyweight1.getFlyweights("Z");
        f3.operation(--extrinsic);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsic);
    }
}