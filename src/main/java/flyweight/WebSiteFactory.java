package flyweight;

import java.util.Hashtable;

/**
 * @author: yyWang
 * @create: 2019/10/19
 * @description: 网站工厂类
 */

public class WebSiteFactory {

    private Hashtable<String, ConcreteFlyweight> flyweights = new Hashtable<>();

    public Flyweight getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }

    // 获取网站分类总数
    public int getWebSiteCount() {
        return flyweights.size();
    }


}
