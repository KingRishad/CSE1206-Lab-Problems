package employeestuffs;

/**
 *
 * @author The one who shall not be named
 */
public class InvalidNameException extends Exception {
    public InvalidNameException() {
        super("Invalid Name: Must be at least 3 characters.");
    }
    
    public InvalidNameException(String message) {
        super(message);
    }
}