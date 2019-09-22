package abstract_factory.data;

import abstract_factory.bean.User;
import abstract_factory.impl.IUser;

/**
 * @author: yyWang
 * @create: 2019/9/22
 * @description: 用于访问 Access 的User
 */

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在Access 中给user 表添加一条记录:" + user.getName() + "," + user.getId());
    }

    @Override
    public User getUser(String id) {
        System.out.println("在Access 中根据" + id + "得到User 表一条记录");
        return null;
    }
}
