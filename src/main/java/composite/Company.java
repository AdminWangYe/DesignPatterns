package composite;

/**
 * @author: yyWang
 * @create: 2019/10/9
 * @description: 组合模式：将对象组合成树形结构以表示‘部分-整体’的层次结构，组合模式使得用户对单个对象和组合对象的
 * 使用具有一致性。
 * 何时使用：当需求中是体现部分与整体层次的结构时，以及你希望用户可以忽略组合对象与单个对象的不同，统一地使用组合结构中
 * 的所有对象时，就应该考虑用组合模式。
 */

public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    // 增加
    public abstract void add(Company company);

    // 移除
    public abstract void remove(Company company);

    // 显示
    public abstract void display(int depth);

    // 履行职责
    public abstract void lineOfDuty();

    public String copyLine(int count) {
        String str = "-";
        for (int i = 1; i < count; i++) {
            str += '-';
        }
        return str;
    }

}
