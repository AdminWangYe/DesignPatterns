package observer.event;

import java.lang.reflect.Method;

/**
 * @author: yyWang
 * @create: 2019/9/21
 * @description: 事件对象的封装类
 */

public class Event {
    // 要执行方法的对象
    private Object object;
    // 要执行的方法名称
    private String methodName;
    // 要执行方法的参数
    private Object[] args;
    // 要执行方法的参数类型
    private Class[] argsTypes;

    public Event(Object object, String methodName) {
        this.object = object;
        this.methodName = methodName;
    }

    /**
     * 根据参数数组生成参数类型数组
     *
     * @param params 参数数组
     */
    private void contractParamTypes(Object[] params) {
        this.argsTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.argsTypes[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }

    /**
     * 根据该对象的方法名，方法参数，利用反射机制，执行该方法
     *
     * @throws Exception
     */
    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(methodName);
        if (method == null) {
            return;
        }
        method.invoke(object);
    }
}
