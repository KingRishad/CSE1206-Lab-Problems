package cardemo;

/**
 *
 * @author The one who shall not be named
 */
public class Car {
    String model;
    int price;
    String owner;
    Car(){}
    Car(String model, int price, String owner){
        this.model = model;
        this.price = price;
        this.owner = owner;
    }
    void soldTo(String name){
        System.out.println("The " +model+ " has been sold to "+owner+" at "+price+" tk.");
    }
}
