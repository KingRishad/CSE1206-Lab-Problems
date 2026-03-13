package cardemo;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Car car1 = new Car();
        
        System.out.println("Enter Owner Name: ");
        car1.setOwner(sc.nextLine());
        System.out.println("Enter Months Used: ");
        car1.setMonthsUsed(sc.nextInt());
        System.out.println("Enter Buying Price: ");
        car1.setBuyingPrice(sc.nextDouble());
        
        Seller seller1 = new Seller();
        
        System.out.println(seller1.calculateResaleValue(car1));
        
        sc.close();
    }
}
