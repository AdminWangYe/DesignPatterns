package responsibility;

/**
 * @author: yyWang
 * @create: 2019/10/12
 * @description: 总经理的权限就是全部都需要处理
 */

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(name + ":请假 " + request.getNumber() + "天，被批准。。。。");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 1000) {
            System.out.println(name + ":请求加薪" + request.getNumber() + "元，被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 1000) {
            System.out.println(name + ":请求加薪失败，以后再说");
        }
    }
}
