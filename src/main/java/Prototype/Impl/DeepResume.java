package Prototype.Impl;

/**
 * @author: yyWang
 * @create: 2019/9/3
 * @description: 实现深复制的代码
 */

public class DeepResume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public DeepResume(String name) {
        this.name = name;
    }

    // 提供 Clone 方法调用的私有构造函数，以便克隆“工作经历”的数据
    public DeepResume(WorkExperience workExperience) {
        try {
            this.workExperience = (WorkExperience) workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String compangy) {
        workExperience.setWorkDate(workDate);
        workExperience.setWorkCompany(compangy);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        DeepResume resume = new DeepResume(this.workExperience);
        resume.setName(this.name);
        resume.setSex(this.sex);
        resume.setAge(this.age);
        return resume;
    }
}
