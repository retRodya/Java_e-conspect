package L05_12_OOP_Practice;

public class c2l12_TrainingGround {
    public static void main(String[] args) {


        /* heroes list */
        // c1l12_Hero hero = new c1l12_Hero("Hero", 33); --- made before designate hero class abstract
        c3l12_Warrior warrior = new c3l12_Warrior("Garrosh", 34);
        c3l12_Mage mage = new c3l12_Mage("Jaina", 33);
        c3l12_Archer archer = new c3l12_Archer("Sylvanas", 33);
        c4l12_Enemy enemy = new c4l12_Enemy("Gul'dan", 235);

        /* heroes attack */
        // System.out.println();
        // hero.attackEnemy(enemy); --- made before designate hero class abstract
        // System.out.println();

        /* --- I method --- */
//        System.out.println();
//        System.out.println(" --- I method --- ");
//        warrior.attackEnemy(enemy);
//        System.out.println();
//        mage.attackEnemy(enemy);
//        System.out.println();
//        archer.attackEnemy(enemy);
//        System.out.println();

        /* --- II method --- */
        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(c4l12_Enemy enemy, c1l12_Hero... heroes) {
        System.out.println();
        System.out.println(" --- II method --- ");
        while (enemy.isAlive()) {
            for (c1l12_Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                    System.out.println();
                }
            }
        }
    }
}
