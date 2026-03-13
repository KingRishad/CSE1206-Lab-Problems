package shapedemo;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangle rectangle1 = new Rectangle();
        
        System.out.println("Enter Length:");
        rectangle1.setLength(sc.nextDouble());
        System.out.println("Enter Width:");
        rectangle1.setWidth(sc.nextDouble());
        
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Area: " + ac.calculateArea(rectangle1));
        sc.close();
    }
}
