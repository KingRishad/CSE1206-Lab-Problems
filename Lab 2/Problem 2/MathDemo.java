package mathdemo;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class MathDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        Math math = new Math(value1,value2);
        System.out.println(math.addNumber());
    }
}
