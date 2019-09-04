package Prototype.Impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepResumeTest {


    @Test
    void testClone() throws CloneNotSupportedException {
        //测试 深复制代码
        DeepResume resume = new DeepResume("小红");
        resume.setAge("20");
        resume.setSex("男");
        resume.setWorkExperience("2018-2019", "杭州");

        DeepResume deepResume = (DeepResume) resume.clone();
        deepResume.setWorkExperience("2013-2014", "电子科技大学");

        System.out.println(resume);
        System.out.println(deepResume);
    }
}