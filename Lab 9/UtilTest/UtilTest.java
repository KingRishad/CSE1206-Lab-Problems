import customexceptions.EmptyArrayException;
/**
 *
 * @author The one who shall not be named
 */
public static void main(String[] args) {
    int[] validArray = {10, 20, 30, 40, 50};
    try {
        System.out.println("Average of validArray: " + Utils.calculateAverage(validArray));
    } catch (EmptyArrayException e) {
        System.out.println("Error: " + e.getMessage());
    }

    int[] emptyArray = {};
    try {
        System.out.println("Average of emptyArray: " + Utils.calculateAverage(emptyArray));
    } catch (EmptyArrayException e) {
        System.out.println("Error: " + e.getMessage());
    }
}