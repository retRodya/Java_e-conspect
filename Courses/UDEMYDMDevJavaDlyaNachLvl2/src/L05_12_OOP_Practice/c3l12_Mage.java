package L05_12_OOP_Practice;

import L06_02_Generics_Theory.Weapon.c3l2_Stuff;

public class c3l12_Mage<T extends c3l2_Stuff> extends L05_12_OOP_Practice.c1l12_Hero<T> {

    public c3l12_Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(L05_12_OOP_Practice.c4l12_Enemy enemy) {
        System.out.println("[mage.attackEnemy]");
        System.out.println(getName() + " have attacked " + enemy.getName() + " with fireball by " + getDamage() + " hit");
        enemy.takeDamage(getDamage());
    }
}
