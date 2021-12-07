package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random veletlen = new Random();
        Fight harc = new Fight(0, 0, 0, 0);
        //Nulla, mivel nem itt lesz kiosztva, és a program lényege az, hogy ezek a számok mindig változzanak miközben
        //A sebzések ki lesznek osztva.
        System.out.println(">Üdvözöllek a kis harcolós programomban.");
        System.out.println(">Neked is, és az NPC-nek is lesz egy életereje amit támadásokkal kell levinni.");
        System.out.println(">Az NPC és te is rendelkezel egy mannaszintel, igaz az NPC manna szintje nem lesz kiiratva.");
        System.out.println(">Körökre van felosztva, egyszer te jösz, egyszer pedig az NPC uraság.");
        System.out.println(">Ha készen állsz, nyomd le az 1-est.");
        try{
            Scanner scanner = new Scanner(System.in);
            int ready = scanner.nextInt();
            while(ready != 1){
                System.out.println("Ha készen állsz, nyomd le az 1-est.");
                ready = scanner.nextInt();
            }
            if(ready == 1)
            {
                harc.rollDamageNPC();
            }
        }
        catch(Exception exception){
            System.out.println("Nem számot adtál meg!");
            System.out.println("Indítsa újra a programot...");
            System.exit(0);
        }
    }
}
