package Prototype;

/**
 * @author: yyWang
 * @create: 2019/8/15
 * @description:
 */

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     *
     * @param sex 性别
     * @param age 年龄
     */
    public void SetPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     *
     * @param timeArea 工作时间，期间
     * @param company  工作公司
     */
    public void SetWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 输出打印信息
     */
    public void Display() {
        System.out.println(String.format("%s\t%s\t%s", name, sex, age));
        System.out.println(String.format("工作经历：%s\t%s", timeArea, company));
    }

    // 浅复制。其实也就是把被复制的这个对象的一些变量拿过来
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
