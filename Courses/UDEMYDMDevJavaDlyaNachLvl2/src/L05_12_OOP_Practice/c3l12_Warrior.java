package L05_12_OOP_Practice;

import L06_02_Generics_Theory.Weapon.c1l2_Axe;

public class c3l12_Warrior<T extends c1l2_Axe> extends c1l12_Hero<T> {

    public c3l12_Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy (c4l12_Enemy enemy) {
        System.out.println("[warrior.attackEnemy]");
        System.out.println(getName() + " have attacked " + enemy.getName() + " with two-handed axe by " + getDamage() + " hit");
        enemy.takeDamage(getDamage());
    }
}
