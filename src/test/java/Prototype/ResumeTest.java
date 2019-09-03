package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResumeTest {

    @Test
    void testClone() throws Exception {
        Resume resume = new Resume("小明");
        resume.SetPersonalInfo("女", "29");
        resume.SetWorkExperience("1996-2003", "华为");

        Resume b = (Resume) resume.clone();
        b.SetWorkExperience("2008-2009", "字节跳动");

        resume.Display();
        b.Display();

    }
}