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

    @Test
    void use() {
        WebSiteFactory web = new WebSiteFactory();

        // 实例化 产品展示
        Flyweight fx = web.getWebSiteCategory("产品展示");
        fx.use();

        // 共享上方生成的对象，不再实例化
        Flyweight fy = web.getWebSiteCategory("产品展示");
        fy.use();

        Flyweight fz = web.getWebSiteCategory("产品展示");
        fz.use();

        Flyweight f1 = web.getWebSiteCategory("博客展示");
        f1.use();

        Flyweight f2 = web.getWebSiteCategory("博客");
        f2.use();

        System.out.println("网站分类总数为：" + web.getWebSiteCount());
    }
}