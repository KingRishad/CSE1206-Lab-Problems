package emailvalidation;
public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Return false if the string is null or empty
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
        // Check the following conditions:
        // 1. '@' must exist and not be the very first character (atIndex > 0)
        // 2. '.' must exist and come at least one character after '@' (dotIndex > atIndex + 1)
        // 3. '.' must not be the very last character (dotIndex < email.length() - 1)

        return atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1;
    }
}
