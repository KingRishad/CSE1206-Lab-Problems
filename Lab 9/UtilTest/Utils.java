import customexceptions.EmptyArrayException;
/**
 *
 * @author The one who shall not be named
 */
public class Utils {

    public static double calculateAverage(int[] arr) throws EmptyArrayException {
        if (arr == null || arr.length == 0) {
            throw new EmptyArrayException();
        }
        
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        return sum / arr.length;
    }
}