package simpleautorpg;

/**
 *
 * @author The one who shall not be named
 */
public class SimpleAutoRPG {
    public static void main(String[] args) {
        Player player = new Player(10.0, 100.0);
        Villain villain = new Villain(10.0, 100.0);

        while (true) {
            player.takeDamage(villain);
            
            villain.takeDamage(player);

            System.out.printf("Player Health: %.2f, Villain Health: %.2f%n", player.getHealth(), villain.getHealth());

            if (player.getHealth() < 0) {
                System.out.println("Player Lost");
                break;
            }

            if (villain.getHealth() < 0) {
                System.out.println("Evil Boss Lost");
                break;
            }
        }
    }
}
