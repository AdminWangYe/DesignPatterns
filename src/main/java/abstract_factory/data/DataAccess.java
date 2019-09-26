package abstract_factory.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;
import java.util.Properties;

import abstract_factory.impl.IUser;

/**
 * @author: yyWang
 * @create: 2019/9/25
 * @description: 使用反射机制，运行时创建实例对象
 * 所有在用简单工厂的地方，都可以考虑用反射技术来去除 switch或if,解除分支判断带来的耦合。
 * 反射技术的确可以很好的解决它们难以应对变化，难以维护和拓展的诟病
 */

public class DataAccess {
    // 反射需要写清楚 带包名的类路径，包名.类名
    private static String dbName = "abstract_factory.data.";
//    private static String dbClass = "SqlServerUser";

    public static IUser createUser() {
        IUser user = null;
        try {

            //  从配置文件中获取要反射的类名
            Properties properties = new Properties();
            FileReader fr = new FileReader("src/main/resources/abstract_factory/reflectionConfig.properties");
            // 加载配置文件
            properties.load(fr);

            // 获取配置文件中的数据
            String dbClass = properties.getProperty("dbClass");
            // 获得class 对象，返回
            user = (IUser) Class.forName(dbName + dbClass).newInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
