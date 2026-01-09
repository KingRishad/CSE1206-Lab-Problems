package tulipshenanigans;

/**
 *
 * @author The one who shall not be named
 */
public class TulipMixer {
    Tulip mixTulip(int noOfPetals1, int noOfPetals2){
        double avg;
        avg = (noOfPetals2 + noOfPetals1) / 2.0;
        int newPetals;
        newPetals = (int) Math.ceil(avg);
        return new Tulip(newPetals , "Red");
    }
    Tulip mixTulip(Tulip tulip1, Tulip tulip2){
        int avgNoOfPetals = ((tulip1.getNoOfPetals() + tulip2.getNoOfPetals()) / 2);
        String newColor;
        
        if((tulip1.getColor().equals("Red") && tulip2.getColor().equals("Green")) || (tulip1.getColor().equals("Green") && tulip2.getColor().equals("Red"))){
            newColor = "Yellow";
        }
        
        else if((tulip1.getColor().equals("Green") && tulip2.getColor().equals("Blue")) || (tulip1.getColor().equals("Blue") && tulip2.getColor().equals("Green"))){
            newColor = "Cyan";
        }
        
        else{
            newColor = "Red";
        }
        
        return new Tulip(avgNoOfPetals,newColor);
    }
}
