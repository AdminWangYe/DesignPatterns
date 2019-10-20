package flyweight;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 用户类，用于网站的客户账号，是“网站”类的外部状态
 */

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
