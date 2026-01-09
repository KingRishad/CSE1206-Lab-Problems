/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Potion;

/**
 *
 * @author The person whose name shall not be said
 */
public class PotionBrewer {
    Potion brewPotion(int volume1, int volume2){
        int newVolume = volume1 + volume2;
        if((volume1+volume2)>=200){
            newVolume = 200;
        }
        Potion tempPotion = new Potion(newVolume, "Mixed");
        return tempPotion;
    }
    
    public Potion brewPotion(Potion potion1, Potion potion2) {
        int newVolume = (potion1.getVolume() + potion2.getVolume()) / 2;
        String effect1 = potion1.getEffect();
        String effect2 = potion2.getEffect();
        String newEffect;

        if((effect1.equals("Healing") && effect2.equals("Strength")) || (effect1.equals("Strength") && effect2.equals("Healing"))){
            newEffect = "Invincibility";
        }
        
        else if((effect1.equals("Speed") && effect2.equals("Neutral")) || (effect1.equals("Neutral") && effect2.equals("Speed"))){
            newEffect = "Swiftness";
        }
        
        else{
            newEffect = "Unknown";
        }

        return new Potion(newVolume, newEffect);
    }

      
}    
