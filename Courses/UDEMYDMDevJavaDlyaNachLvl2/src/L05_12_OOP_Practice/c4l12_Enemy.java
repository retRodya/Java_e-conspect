package L05_12_OOP_Practice;

public class c4l12_Enemy implements i5l12_Mortal {
    private int health;
    private String name;

    public c4l12_Enemy(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage (int damage) {
        System.out.println("[enemy.takeDamage]");
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " died. Rip.");
        } else {
            this.health -= Math.min(health, damage);
            System.out.println(getName() + " took " + damage + " damage. Current enemy health = " + getHealth());
        }
    }
    @Override
    public boolean  isAlive() {
        System.out.println("[enemy.isAlive]");
        return getHealth() > 0;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }



}
