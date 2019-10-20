package visitor;

import java.util.ArrayList;

import java.util.List;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 对象结构类，由于总需要 ‘男人’和 ‘女人’在不同状态的对比，
 * 因此需要一个 ‘对象结构类’来针对不同的状态 遍历 男人和女人 得到不同的反应。
 */

public class ObjectiveStructure {

    private List<Person> persons = new ArrayList<Person>();

    // 添加
    public void attach(Person element) {
        persons.add(element);
    }

    // 移除
    public void detach(Person element) {
        persons.remove(element);
    }

    // 查看显示
    public void display(Action visit) {
        for (Person p : persons) {
            p.accept(visit);
        }
    }

}
