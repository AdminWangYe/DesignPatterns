package proxy;

import proxy.Imple.IGiveGIft;
import proxy.Imple.Pursuit;
import proxy.Imple.SchoolGirl;

/**
 * @author: yyWang
 * @create: 2019/8/14
 * @description: 让代理 去实现 送花的接口,
 */


/**
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
 * 代理模式的应用：
 * 第一，远程代理，也就是为一个对象在不同的地址空间提供局部代表，这样就可以隐藏一个对象存在于不同地址空间的事实。
 * <p>
 * 第二，虚拟代理，是根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象。（如，浏览器通过虚拟代理来替代真实的图片。此时代理存放了
 * 真实图片的路径和尺寸，用来优化下载）
 * <p>
 * 第三，安全代理，用来控制真实对象访问时的权限，一般用于对象应该有不同的访问权限的时候。
 * <p>
 * 第四，智能指引，是指当调用真实的对象是，代理处理另外一些事,（如 计算真实对象的引用次数，这样当该对象没有引用时，可以自动释放它）
 * <p>
 * 代理模式其实就是在访问对象是引入一定程度的间接性，因为这种间接性，可以附加多种用途
 */
public class Proxy implements IGiveGIft {

    //    追求者
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {

        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {

        gg.GiveChocolate();
    }
}
