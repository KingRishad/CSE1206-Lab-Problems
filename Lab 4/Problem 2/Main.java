package tulipshenanigans;
import java.util.Scanner;

/**
 *
 * @author The one who shall not be named
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Tulip 1:");
        System.out.print("No of Petals: ");
        int petals1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Color: ");
        String color1 = sc.nextLine();


        System.out.println("Tulip 2:");
        System.out.print("No of Petals: ");
        int petals2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Color: ");
        String color2 = sc.nextLine();


        Tulip t1 = new Tulip(petals1, color1);
        Tulip t2 = new Tulip(petals2, color2);

        
        TulipMixer mixer = new TulipMixer();

        
        Tulip newTulip1 = mixer.mixTulip(petals1, petals2);
        Tulip newTulip2 = mixer.mixTulip(t1, t2);

        
        System.out.println("\nNew Tulip 1");
        System.out.println("No of Petals: " + newTulip1.getNoOfPetals());
        System.out.println("Color: " + newTulip1.getColor());

        System.out.println("\nNew Tulip 2");
        System.out.println("No of Petals: " + newTulip2.getNoOfPetals());
        System.out.println("Color: " + newTulip2.getColor());
        sc.close();
    }
}
