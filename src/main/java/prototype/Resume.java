package prototype;

/**
 * @author: yyWang
 * @create: 2019/8/15
 * @description: 原型模式方法，就是用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 拷贝分为浅复制和深复制，
 * 深复制就是把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象
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

    // 浅复制。其实也就是把被复制的这个对象的一些变量拿过来，创建当前对象的浅表副本

    /**
     * 创建当前对象的浅表副本，方法是创建一个新对象，然后将当前对象的非静态字段复制到该新对象，
     * 如果字段是值类型的，则对该字段执行逐位复制。
     * 如果该字段是引用类型，则复制应用但不复制引用的对象。因此原始对象及其副本引用同一对象
     *
     * @return 返回创建浅表副本对象
     * @throws CloneNotSupportedException 实例不存在
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
