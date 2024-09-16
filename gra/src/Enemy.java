public class Enemy {
    private int level;
    private int health;
    private int attack;

    public Enemy(int playerLevel) {
        this.level = (int) (playerLevel * 0.75);
        this.health = this.level * 100;
        this.attack = this.level * 10;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
