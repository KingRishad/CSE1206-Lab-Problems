package customexceptions;
/**
 *
 * @author The one who shall not be named
 */
public class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("The array is empty.");
    }
}