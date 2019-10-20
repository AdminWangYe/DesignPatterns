package interpreter;

/**
 * @author: yyWang
 * @create: 2019/10/20
 * @description: 音符类
 */

public class Note extends Expression {
    @Override
    public void excuse(String playKey, double doublePlayValue) {

        String note = "";

        // 表示 如果获得的key 是C则演奏 1（do), 如果是D 则演奏2（Re)
        switch (playKey) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(note + " ");
    }
}
