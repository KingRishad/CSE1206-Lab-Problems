/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Potion;

/**
 *
 * @author The person whose name shall not be said
 */
public class Potion {
    private int volume;
    private String effect;
    
    void setVolume(int volume){
        this.volume = volume;
    }
    void setEffect(String effect){
        this.effect = effect;
    }
    int getVolume(){
        return this.volume;
    }
    String getEffect(){
        return this.effect;
    }
    
    public Potion(){
        volume = 100;
        effect = "Neutral";
    }
    public Potion(int volume, String effect){
        this.volume = volume;
        this.effect = effect;
    }
}
