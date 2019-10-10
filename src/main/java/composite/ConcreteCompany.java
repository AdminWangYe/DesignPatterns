package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yyWang
 * @create: 2019/10/9
 * @description: 具体公司类，实现接口，树枝 节点
 */

public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(copyLine(depth) + name);
        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
