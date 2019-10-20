package interpreter;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 表达式类 AbstractExpression
 */

public abstract class Expression {

    protected double doublePlayValue;

    // 解释器
    public void interpret(PlayContext context) {
        if (context.getText().length() == 0) {
            return;
        }

        // 此方法用于将当前的演奏文本第一条命令
        // 获得 命令字母和其参数值
        // 例如 O 3 E 0.5 G 0.5 A 3
        // 则 playKey 为 O playValue 为3
        String playKey = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));

        doublePlayValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));

        // 获取 playKey 和 playValue 后将其从演奏文本中移除
        // 文本变成了 E 0.5 G 0.5 A 3
        context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

        excuse(playKey, doublePlayValue);

    }

    // 抽象方法 执行，不同的文法子类，有不同的执行处理
    public abstract void excuse(String playKey, double doublePlayValue);

}
