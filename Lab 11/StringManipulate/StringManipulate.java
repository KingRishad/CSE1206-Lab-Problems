package stringmanipulate;
import java.util.Scanner;
public class StringManipulate {
    public static void main(String[] args) {
        System.out.println("s: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("n: ");
        int n1 = sc.nextInt();
        System.out.println(StringManipulator.insertDash(s1, n1)); 
        sc.close();
    }
}
