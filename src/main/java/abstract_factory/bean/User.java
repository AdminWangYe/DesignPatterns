package abstract_factory.bean;

/**
 * @author: yyWang
 * @create: 2019/9/22
 * @description: 用户类，用抽象工厂模式来访问数据
 */

public class User {
    // 用户名
    private String name;
    // 用户ID
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
