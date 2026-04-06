package wordcasealternation;

/**
 *
 * @author The one who shall not be named
 */
public class WordCaseAlternator {
    public static String alternateWordCases(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Split the sentence into an array of words based on spaces
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) {
                result.append(words[i].toUpperCase());
            } 
            else {
                result.append(words[i].toLowerCase());
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
