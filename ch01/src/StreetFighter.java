public class StreetFighter {
    static void main(String[] args) {
        /*
            我方:叉子   对方:长手
            攻击:220   攻击:210
            防御:180   防御:180
            血量:2000  血量:2000
            技能加成:1.2  技能加成:1.1
            技能造成伤害:220*1.2=264  技能造成伤害:210*1.1=231
            普通攻击造成伤害:220-180=40  普通攻击造成伤害:210-180=30

            计算伤害:
            技能造成伤害:264-180=84
            普通攻击造成伤害:264-180=84

         */
        //定义我方的变量
        int myAttack = 220;
        int myDefense = 180;
        int blood = 2000;
        double skillAttack = 1.2;

        //定义对方
        int enemyAttack = 210;
        int enemyDefense = 180;
        int enemyBlood = 2000;
        double enemySkillAttack = 1.1;

        //第一次普通攻击造成的伤害
        int normalAttackDamage = myAttack - enemyDefense;
        System.out.println("第一次普通攻击造成的伤害:" + normalAttackDamage);
        System.out.println("对方剩余血量:" + (enemyBlood - normalAttackDamage));

        //第一次技能攻击造成的伤害
        int skillAttackDamage = (int) (myAttack * skillAttack) - enemyDefense;
        System.out.println("第一次技能攻击造成的伤害:" + skillAttackDamage);
        System.out.println("对方剩余血量:" + (enemyBlood - skillAttackDamage-normalAttackDamage));
    }
}
