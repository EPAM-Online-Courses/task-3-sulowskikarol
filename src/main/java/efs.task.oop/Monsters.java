package efs.task.oop;

public class Monsters {
    public static final Monster andariel = new Monster(10 ,70) {
        public void takeHit(int damage) {
            super.takeHit(damage);
            Monsters.monstersHealth -= damage;
        }
    };

    public static final Monster blacksmith = new Monster(100 ,25) {
        public void takeHit(int damage) {
            super.takeHit(5 + damage);
            Monsters.monstersHealth -= 5 + damage;
        }
    };

    private static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }
}
