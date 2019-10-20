package responsibility;

/**
 * @author: yyWang
 * @create: 2019/10/12
 * @description: 总监类，
 */

public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 7) {
            System.out.println(name + ":请假 " + request.getNumber() + "天，被批准");
        } else {
            // 总监所能有的权限就是可批准许下属一周内的假期
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
