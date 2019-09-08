package builder;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description:
 */

public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(String name) {
        super(name);
    }

    @Override
    public void buildHead() {
        System.out.println(this.name + "生成头的过程");
    }

    @Override
    public void buildBody() {

        System.out.println(this.name + "生成一个身子");
    }

    @Override
    public void buildArmLeft() {

        System.out.println(this.name + "生成一个左胳膊");
    }

    @Override
    public void buildArmRight() {

        System.out.println(this.name + "生成一个右胳膊");
    }

    @Override
    public void buildLegLeft() {

        System.out.println(this.name + "生成一个左腿");
    }

    @Override
    public void buildLegRight() {

        System.out.println(this.name + "生成一个右腿");
    }
}
