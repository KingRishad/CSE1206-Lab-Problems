package employeestuffs;

/**
 *
 * @author The one who shall not be named
 */
public class InvalidSalaryException extends Exception {
    public InvalidSalaryException() {
        super("Invalid Salary: Salary cannot be less than 0.");
    }
    
    public InvalidSalaryException(String message) {
        super(message);
    }
}
