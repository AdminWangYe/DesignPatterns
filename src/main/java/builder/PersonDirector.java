package builder;

/**
 * @author: yyWang
 * @create: 2019/9/8
 * @description: 建造模式中的指挥者类，用于控制建造过程，也用它来隔离用户与建造过程的关联
 */

public class PersonDirector {

    private PersonBuilder personBuilder;

    /**
     * 用户告诉指挥者，我需要什么样的小人
     *
     * @param personBuilder 创建者类
     */
    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
//        根据用户的选择建造小人
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
