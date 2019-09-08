package proxy.Imple;

/**
 * @author: yyWang
 * @create: 2019/8/14
 * @description: 追求者类
 */

public class Pursuit implements IGiveGIft {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {

        System.out.println(mm.getName()+" 送你洋娃娃。。。");

    }

    @Override
    public void GiveFlowers() {

        System.out.println(mm.getName()+" 送你玫瑰花。。。");
    }

    @Override
    public void GiveChocolate() {

        System.out.println(mm.getName()+" 送你巧克力。。。");
    }
}
