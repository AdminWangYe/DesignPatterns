package composite;

/**
 * @author: yyWang
 * @create: 2019/10/9
 * @description: 财政部
 */

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {

        System.out.println(copyLine(depth) + name);
    }

    @Override
    public void lineOfDuty() {

        System.out.println(name + " 公司财务收支管理");
    }
}
