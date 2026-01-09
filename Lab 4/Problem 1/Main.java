/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Potion;
import java.util.Scanner;
/**
 *
 * @author The person whose name shall not be said
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Potion 1:");
        System.out.print("Volume: ");
        int volume1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Effect: ");
        String effect1 = sc.nextLine();

        System.out.println("Potion 2:");
        System.out.print("Volume: ");
        int volume2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Effect: ");
        String effect2 = sc.nextLine();

        Potion potion1 = new Potion(volume1, effect1);
        Potion potion2 = new Potion(volume2, effect2);

        PotionBrewer brewer = new PotionBrewer();

        Potion newPotion1 = brewer.brewPotion(volume1, volume2);
        Potion newPotion2 = brewer.brewPotion(potion1, potion2);

        System.out.println("\nNew Potion 1");
        System.out.println("Volume: " + newPotion1.getVolume());
        System.out.println("Effect: " + newPotion1.getEffect());

        System.out.println("\nNew Potion 2");
        System.out.println("Volume: " + newPotion2.getVolume());
        System.out.println("Effect: " + newPotion2.getEffect());
        sc.close();
    }
}
