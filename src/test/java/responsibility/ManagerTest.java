package responsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    // 职责链模式测试类
    @Test
    void requestApplication() {
        CommonManage common = new CommonManage("金坷垃");
        Majordomo majordomo = new Majordomo("习大大");
        GeneralManager general = new GeneralManager("叶问");

        // 设置上级
        common.setSuperior(majordomo);
        majordomo.setSuperior(general);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小王请假");
        request.setNumber(2);
        // 客户端的申请都是由“经理”发起，但实际谁来决策由具体管理类来处理，客户端不知道
        common.requestApplication(request);

        request.setRequestType("请假");
        request.setRequestContent("小王请假");
        request.setNumber(5);
        common.requestApplication(request);

        request.setRequestType("请假");
        request.setRequestContent("小王请假");
        request.setNumber(10);
        common.requestApplication(request);

        request.setRequestType("加薪");
        request.setRequestContent("小王请求加薪");
        request.setNumber(2000);
        common.requestApplication(request);

    }
}