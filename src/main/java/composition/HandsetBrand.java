package composition;

/**
 * @author: yyWang
 * @create: 2019/10/10
 * @description: 手机品牌类
 */

public abstract class HandsetBrand {
    protected HandsetSoft soft;

    // 品牌需要关注软件，所以可以在机器中安装软件，以备运行
    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void brandRun();
}
