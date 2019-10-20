package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void excuse() {

        PlayContext context = new PlayContext();

        // 音乐 上海滩
        System.out.println("上海滩：");
        context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 T 1000 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 T 200 G 1 D 3 ");
        Expression expression = null;

        while (context.getText().length() > 0) {
            String str = context.getText().substring(0, 1);
            switch (str) {
                // 当首字母是 O 是，则表达式实例化为音阶
                case "O":
                    expression = new Scale();
                    break;
                case "T":
                    expression = new Speed();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                    // 当 首字母是 CDEFGAB 以及休止符为 P，则实例化音符
                case "P":
                    expression = new Note();
                    break;
            }
            assert expression != null;
            expression.interpret(context);
        }


    }
}