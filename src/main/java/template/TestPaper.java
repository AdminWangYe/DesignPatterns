package template;

/**
 * @author: yyWang
 * @create: 2019/9/4
 * @description: 用学生做试卷的例子去介绍模板方法模式
 * <p>
 * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构
 * 即可重定义该算法的某些特定步骤。
 * 比如：该实例中做试卷，父类 TestPaper 是抽象类，定义了一些抽象的行为如回答题目方法，因为每个子类回答问题这个行为
 * 可能不一致，但其他方法，比如问题题目什么的公有的。
 * <p>
 * 模板方法模式是通过把不变行为搬迁到父类（超类），去除子类重复的代码来体现它的优势。
 * 当不变的和可变的行为在方法的子类实现中混合在一起的时候，不变的行为就会在子类中重复出现，我们通过模板方法模式把这些
 * 行为搬迁到单一的地方，这样就帮助子类摆脱重复的不变行为的纠缠。
 */

public abstract class TestPaper {
    public void testQuestion1() {
        System.out.println("2019年9月4号是星期几？\nA.星期四\tB.星期二\tC.星期日\tD.你猜");
        System.out.println("你的答案：" + answerQuestion1());
    }

    public void testQuestion2() {
        System.out.println("爸爸的妈妈叫什么？\nA.奶妈\tB.外婆\tC.爷爷\tD.不晓得");
        System.out.println("你的答案：" + answerQuestion2());
    }

    public void testQuestion3() {
        System.out.println("中国有多少个民族？\nA.56\tB.70\tC.58\tD.55");
        System.out.println("你的答案：" + answerQuestion3());
    }

    public abstract String answerQuestion1();

    public abstract String answerQuestion2();

    public abstract String answerQuestion3();
}
