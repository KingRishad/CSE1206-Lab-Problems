package cardemo;

/**
 *
 * @author The one who shall not be named
 */
public class Car {
    private String owner;
    private int monthsUsed;
    private double buyingPrice;

    public Car(String owner, int monthsUsed, double buyingPrice) {
        this.owner = owner;
        this.monthsUsed = monthsUsed;
        this.buyingPrice = buyingPrice;
    }

    public Car() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    
}
