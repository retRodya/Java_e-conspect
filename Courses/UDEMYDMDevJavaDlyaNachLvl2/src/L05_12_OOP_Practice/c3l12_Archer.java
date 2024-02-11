package L05_12_OOP_Practice;

import L06_02_Generics_Theory.Weapon.i3l2_RangeWeapon;

import java.util.Random;

public class c3l12_Archer<T extends i3l2_RangeWeapon> extends c1l12_Hero <T>{

    public c3l12_Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(c4l12_Enemy enemy) {
        System.out.println("[archer.attackEnemy]");
        if (Bow.isSkillProced()) {
            System.out.println(getName() + " have attacked " + enemy.getName() + " with shadow shot by " + (getDamage() + Bow.damage) + " hit");
            enemy.takeDamage(getDamage() + Bow.skill());
        } else {
            System.out.println(getName() + " have attacked " + enemy.getName() + " with shadow shot by " + getDamage() + " hit");
            enemy.takeDamage(getDamage());
        }
    }

    static class Bow {

        private static final String name = "Rae'shalare";
        private final static int damage = 5;

        static boolean isSkillProced() {
            Random random = new Random();
            if (random.nextInt(100) > 50) {
                System.out.println(name + " proced");
                return true;
            } else return false;
        }

        static int skill() {
            return damage;
        }
    }
}
