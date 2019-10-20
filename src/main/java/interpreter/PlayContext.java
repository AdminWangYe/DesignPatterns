package interpreter;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 演奏内容类，
 * 使用音乐实例来实现 解释器模式
 */

public class PlayContext {

    // 演奏文本
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
