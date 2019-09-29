package abstract_factory.data;

import abstract_factory.impl.IFactory;
import abstract_factory.impl.IUser;

/**
 * @author: yyWang
 * @create: 2019/9/22
 * @description: 实现 IFactory 接口，实例化 AccessUser
 */

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
