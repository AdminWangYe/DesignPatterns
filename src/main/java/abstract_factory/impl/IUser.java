package abstract_factory.impl;

import abstract_factory.bean.User;

/**
 * IUser 接口，用于客户端访问，解除与具体数据库访问的耦合
 */
public interface IUser {

    // 向数据库中添加一条用户记录
    void insert(User user);

    // 通过用户的ID查询用户
    User getUser(String id);

}
