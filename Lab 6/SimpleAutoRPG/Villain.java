package simpleautorpg;

/**
 *
 * @author The one who shall not be named
 */
public class Villain extends Character{
    public Villain(double damage, double health) {
        super(damage, health);
    }
    
    @Override
    public double attack() {
        return getDamage() * MultiplierUtils.getRandomNerf();
    }
}
