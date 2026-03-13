package cardemo;

/**
 *
 * @author The one who shall not be named
 */
public class Seller {
    double calculateResaleValue(Car oldCar){
        double resaleValue = ((oldCar.getBuyingPrice()) - (10000*oldCar.getMonthsUsed()));
        return resaleValue;
    }
}
