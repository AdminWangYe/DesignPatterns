package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 不需要共享的 Flyweight 子类，因为 Flyweight 接口共享成为可能，但它并不强制共享
 */

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extricate) {
        System.out.println("不共享的具体 Flyweight:" + extricate);
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类" + "用户：" + user.getName());
    }


}
