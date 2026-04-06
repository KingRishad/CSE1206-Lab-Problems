package simpleautorpg;

/**
 *
 * @author The one who shall not be named
 */
public class Player extends Character{
    public Player(double damage, double health) {
        super(damage, health);
    }

    @Override
    public double attack() {
        return getDamage() * MultiplierUtils.getRandomBuff();
    }
}
