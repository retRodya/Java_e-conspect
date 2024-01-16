package L05_12_OOP_Practice;

public class c3l12_Archer extends c1l12_Hero {

    public c3l12_Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy (c4l12_Enemy enemy) {
        System.out.println("[archer.attackEnemy]");
        System.out.println(getName() + " have attacked " + enemy.getName() + " with shadow shot by " + getDamage() + " hit");
        enemy.takeDamage(getDamage());
    }
}
