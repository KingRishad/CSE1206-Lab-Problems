package emailvalidation;
import java.util.Scanner;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(EmailValidator.isValidEmail(sc.nextLine()));
        sc.close();
    }
}
