package abstract_factory.impl;

/**
 * 定义一个创建访问 User表对象的抽象的工厂接口
 */
public interface IFactory {
    IUser createUser();
}
