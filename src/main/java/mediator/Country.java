package mediator;

/**
 * @author: yyWang
 * @create: 2019/10/16
 * @description: 国家类，相当于 colleague
 */

public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    public abstract void getMessage(String message);
}
