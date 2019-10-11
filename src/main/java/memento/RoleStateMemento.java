package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 角色状态存储箱类
 */

public class RoleStateMemento {

    private int vit;
    private int att;
    private int def;

    public RoleStateMemento(int vitality, int attack, int defense) {
        vit = vitality;
        att = attack;
        def = defense;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
