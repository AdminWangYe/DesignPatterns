package memento;

/**
 * @author: yyWang
 * @create: 2019/10/7
 * @description: 使用游戏角色类需要备份相关数据，来展示备份模式
 */

public class GameRole {
    // 生命力
    private int vitality;
    // 攻击力
    private int attack;
    // 防御力
    private int defense;

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // 状态展示
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + getVitality() + "\n" + "攻击力：" + getAttack() + "\n" + "防御力：" + getDefense());
        System.out.println("------------------------------");
    }

    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    /**
     * 与boss 大战后，数据状态改变
     */
    public void fightBoss() {
        this.vitality = 50;
        this.defense = 60;
        this.attack = 0;
    }

    /**
     * 角色状态的三个状态值通过 实例化 角色状态存储箱 返回，保存角色相关的数据
     *
     * @return 返回实例化的角色状态存储箱
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    /**
     * 恢复相关数据值
     *
     * @param memento 角色状态存储类
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVit();
        this.attack = memento.getAtt();
        this.defense = memento.getDef();

    }
}
