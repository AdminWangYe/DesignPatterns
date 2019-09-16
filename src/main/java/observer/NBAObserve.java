package observer;

/**
 * @author: yyWang
 * @create: 2019/9/16
 * @description: 观看NBA直播的同事
 */

public class NBAObserve extends MyObserver {

    public NBAObserve(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getSubjectState() + " " + name + " 关闭NBA直播，继续工作");
    }
}
