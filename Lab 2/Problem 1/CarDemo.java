package cardemo;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter model and price of car: ");
        String model = sc.nextLine();
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter buyer of the car");
        String owner = sc.nextLine();
        Car car1 = new Car(model, price, owner);
        car1.soldTo(owner);
        sc.close();
    }
}
