package responsibility;

/**
 * @author: yyWang
 * @create: 2019/10/12
 * @description: 经理类，可以继承管理者类，只需重写申请请求 的方法就可以了
 */

public class CommonManage extends Manager {
    public CommonManage(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {

        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name + ":请假" + request.getNumber() + "被批准。。");
        } else {
            // 其余的申请都需要转到上级
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
