package employeestuffs;

/**
 *
 * @author The one who shall not be named
 */

public class InvalidIdException extends Exception {
    public InvalidIdException() {
        super("Invalid ID: ID cannot be 0.");
    }
    
    public InvalidIdException(String message) {
        super(message);
    }
}
