package simpleautorpg;

/**
 *
 * @author The one who shall not be named
 */
public class Character {
    private double damage;
    private double health;

    public Character(double damage, double health) {
        this.damage = damage;
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double attack() {
        return damage;
    }

    public void takeDamage(Character other) {
        this.health -= other.attack();
    }
}
