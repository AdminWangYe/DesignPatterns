package Prototype.Impl;

/**
 * @author: yyWang
 * @create: 2019/9/3
 * @description: 工作经历
 */

public class WorkExperience implements Cloneable {
    // 工作时间
    private String workDate;
    // 工作公司
    private String workCompany;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    // 拷贝函数
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "工作经历：" + this.workDate + "\t" + this.workCompany;
    }
}
