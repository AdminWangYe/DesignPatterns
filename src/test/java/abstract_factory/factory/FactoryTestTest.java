package abstract_factory.factory;

import abstract_factory.bean.User;
import abstract_factory.data.AccessFactory;
import abstract_factory.data.SqlServerFactory;
import abstract_factory.impl.IFactory;
import abstract_factory.impl.IUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTestTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testSimpleFactory() throws Exception {
        User user = new User("小红");
        user.setId("00000001");
        IFactory factory = new SqlServerFactory();
        IFactory factory1 = new AccessFactory();

        IUser iu = factory.createUser();
        IUser iu1 = factory1.createUser();

        iu.insert(user);
        iu.getUser("0000002");

        iu1.insert(user);
        iu1.getUser("00000002");
    }
}