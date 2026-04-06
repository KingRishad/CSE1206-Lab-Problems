package wordcasealternation;
import java.util.Scanner;
/**
 *
 * @author The one who shall not be named
 */
public class WordCaseAlternation {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Sentence: ");
            System.out.println(WordCaseAlternator.alternateWordCases(sc.nextLine()));
        sc.close();
    }
}
