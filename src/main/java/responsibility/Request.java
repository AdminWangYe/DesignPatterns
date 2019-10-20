package responsibility;

/**
 * @author: yyWang
 * @create: 2019/10/12
 * @description: 申请类型
 */

public class Request {

    // 申请类型
    private String requestType;

    // 申请内容
    private String requestContent;

    // 申请数量
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
