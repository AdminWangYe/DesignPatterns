package abstract_factory.data;

import abstract_factory.bean.User;
import abstract_factory.impl.IUser;

/**
 * @author: yyWang
 * @create: 2019/9/22
 * @description: 用于访问SQL server 的User
 */

public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.printf("在SQL server 中给user 表添加一条记录:%s,%s%n", user.getName(), user.getId());
    }

    @Override
    public User getUser(String id) {
        System.out.printf("在SQL server 中根据%s得到User 表一条记录%n", id);
        return null;
    }
}
