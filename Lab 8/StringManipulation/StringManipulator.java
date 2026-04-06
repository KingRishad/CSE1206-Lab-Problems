package stringmanipulate;
public class StringManipulator {

    public static String insertDash(String s, int n) {
        if (s == null || s.isEmpty() || n <= 0) {
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if ((i + 1) % n == 0 && i != s.length() - 1) {
                result.append('-');
            }
        }

        return result.toString();
    }
}