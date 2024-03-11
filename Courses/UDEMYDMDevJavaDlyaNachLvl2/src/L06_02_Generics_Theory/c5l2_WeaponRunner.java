package L06_02_Generics_Theory;


import L05_12_OOP_Practice.*;
import L06_02_Generics_Theory.Weapon.*;

import java.util.List;
import java.util.Map;

public class c5l2_WeaponRunner {

    public static void printWeaponDamage(c1l12_Hero <? extends c1l2_Axe> hero) {
        c1l2_Axe axe = hero.getWeapon();
        System.out.println(hero.getWeapon().getDamage());
    }

    public static void main(String[] args){                                               
        c3l12_Archer <c2l2_Bow> archer = new c3l12_Archer<c2l2_Bow>("Sylvanas", 10);
        archer.setWeapon(new c2l2_Bow());

        c3l12_Warrior<c1l2_Axe> warrior = new c3l12_Warrior<>("Garrosh", 15);
        warrior.setWeapon(new c1l2_Axe());

        c3l12_Mage<c3l2_Stuff> mage = new c3l12_Mage<>("Jaina", 20);
        mage.setWeapon(new c3l2_Stuff());
    }


}
