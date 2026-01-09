package tulipshenanigans;

/**
 *
 * @author The one who shall not be named
 */
public class Tulip {
    private int noOfPetals;
    private String color;

    void setNoOfPetals(int noOfPetals){
        this.noOfPetals = noOfPetals;
    }
    void setColor(String color){
        this.color = color;
    }
    
    int getNoOfPetals(){
        return this.noOfPetals;
    }
    String getColor(){
        return this.color;
    }
    Tulip(int noOfPetals, String color){
        this.color = color;
        this.noOfPetals = noOfPetals;
    }
}
