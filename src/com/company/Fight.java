package com.company;

import java.util.Random;
import java.util.Scanner;

public class Fight extends Skills {
    static int mannaLevelNPC = 180; //Nehezítés képen, minden RNG-n fog múlni.
    static int mannalevelPlayer = 150;

    public Fight(int lightningSword, int dragonPunch, int demonlordAttack, int normalAttack) {
        super(lightningSword, dragonPunch, demonlordAttack, normalAttack);
    }

    public void rollDamageNPC() {
        Random veletlen = new Random();
        int eletero = 650; //Ez itt az én életerőm
        int eleteroNPC = 650; //NPC életereje
        boolean npcTurn = true;
        boolean playerTurn = false;
        int mvisszatoltes = 0;
        int mvsiszatoltesNPC = 0;
        int eleterovissza = 0;
        int eleterovisszanpc = 0;
        while (eletero >= 0 && mannaLevelNPC >= 0 && npcTurn) {
            int whichAttack = veletlen.nextInt(1, 6); //Szabályozni kellet a manna alapján,
            switch (whichAttack) {
                case 1:
                    if (mannaLevelNPC >= 30) {
                        setDemonlordAttack(veletlen.nextInt(60, 120));
                        eletero -= getDemonlordAttack();
                        System.out.println("NPC Ennyi sebzést okozott neked, a démon úr csapással: " + getDemonlordAttack() + " Új életerőd: " + eletero);
                        mannaLevelNPC -= 30;
                        npcTurn = false;
                        playerTurn = true;
                    }
                    else if(mvsiszatoltesNPC < 1){
                        System.out.println("NPC Manna visszatöltést használt.");
                        mannaLevelNPC += 60;
                        mvsiszatoltesNPC+=1;
                        npcTurn = false;
                        playerTurn = true;
                    }
                    break;
                case 2:
                    if (mannaLevelNPC >= 20) {
                        setLightningSword(veletlen.nextInt(30, 50));
                        mannaLevelNPC -= 20;
                        eletero -= getLightningSword();
                        System.out.println("NPC Ennyi sebzést okozott neked a, Villám kard támadással: " + getLightningSword() + " Új életerőd: " + eletero);
                        npcTurn = false;
                        playerTurn = true;
                    }
                    break;
                case 3:
                    if (mannaLevelNPC >= 15) {
                        setDragonPunch(veletlen.nextInt(20, 40));
                        mannaLevelNPC -= 15;
                        eletero -= getDragonPunch();
                        System.out.println("NPC Ennyi sebzést okozott neked, a Sárkány ütéssel: " + getDragonPunch() + " Új életerőd: " + eletero);
                        npcTurn = false;
                        playerTurn = true;
                    } else {
                        setNormalAttack(veletlen.nextInt(5, 10));
                        eletero -= getNormalAttack();
                        System.out.println("NPC Ennyi sebzést okozott neked, a Normális támadással: " + getNormalAttack() + " Új életerőd: " + eletero);
                        npcTurn = false;
                        playerTurn = true;
                    }
                    break;
                case 4:
                    if(mvsiszatoltesNPC <= 1){
                        System.out.println("NPC Manna visszatöltést használt.");
                        mannaLevelNPC += 60;
                        mvsiszatoltesNPC+=1;
                        npcTurn = false;
                        playerTurn = true;
                    } else{
                        if(mannaLevelNPC >= 30){
                            setDemonlordAttack(veletlen.nextInt(60, 120));
                            eletero -= getDemonlordAttack();
                            System.out.println("NPC Ennyi sebzést okozott neked, a démon úr csapással: " + getDemonlordAttack() + " Új életerőd: " + eletero);
                            mannaLevelNPC -= 30;
                            npcTurn = false;
                            playerTurn = true;
                        }
                        else if(mannaLevelNPC >=20){
                            setLightningSword(veletlen.nextInt(30, 50));
                            mannaLevelNPC -= 20;
                            eletero -= getLightningSword();
                            System.out.println("NPC Ennyi sebzést okozott neked a, Villám kard támadással: " + getLightningSword() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        }
                        else if(mannaLevelNPC >= 15){
                            setDragonPunch(veletlen.nextInt(20, 40));
                            mannaLevelNPC -= 15;
                            eletero -= getDragonPunch();
                            System.out.println("NPC Ennyi sebzést okozott neked, a Sárkány ütéssel: " + getDragonPunch() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        } else{
                            setNormalAttack(veletlen.nextInt(5, 10));
                            eletero -= getNormalAttack();
                            System.out.println("NPC Ennyi sebzést okozott neked, a Normális támadással: " + getNormalAttack() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        }
                    }
                case 5:
                    if(npcTurn && mannaLevelNPC >=30 && eleterovisszanpc == 0 && eletero > 0){
                        System.out.println("NPC Életerő visszatöltést használt..");
                        eleteroNPC+=100;
                        mannaLevelNPC -= 30;
                        eleterovisszanpc+=1;
                        System.out.println("NPC Új életereje: "+eleteroNPC);
                        npcTurn = false;
                        playerTurn = true;
                    } else if(npcTurn && mvsiszatoltesNPC > 1){
                        if(mannaLevelNPC >= 30){
                            setDemonlordAttack(veletlen.nextInt(60, 120));
                            eletero -= getDemonlordAttack();
                            System.out.println("NPC Ennyi sebzést okozott neked, a démon úr csapással: " + getDemonlordAttack() + " Új életerőd: " + eletero);
                            mannaLevelNPC -= 30;
                            npcTurn = false;
                            playerTurn = true;
                        }
                        else if(mannaLevelNPC >=20){
                            setLightningSword(veletlen.nextInt(30, 50));
                            mannaLevelNPC -= 20;
                            eletero -= getLightningSword();
                            System.out.println("NPC Ennyi sebzést okozott neked a, Villám kard támadással: " + getLightningSword() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        }
                        else if(mannaLevelNPC >= 15){
                            setDragonPunch(veletlen.nextInt(20, 40));
                            mannaLevelNPC -= 15;
                            eletero -= getDragonPunch();
                            System.out.println("NPC Ennyi sebzést okozott neked, a Sárkány ütéssel: " + getDragonPunch() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        } else{
                            setNormalAttack(veletlen.nextInt(5, 10));
                            eletero -= getNormalAttack();
                            System.out.println("NPC Ennyi sebzést okozott neked, a Normális támadással: " + getNormalAttack() + " Új életerőd: " + eletero);
                            npcTurn = false;
                            playerTurn = true;
                        }
                    }
            }
            if (mannaLevelNPC >= 0 && npcTurn && eleteroNPC > 0) {
                setNormalAttack(veletlen.nextInt(5, 10));
                eletero -= getNormalAttack();
                System.out.println("Ennyi sebzést okozott neked, a Normális támadással: " + getNormalAttack() + " Új életerőd: " + eletero);
                npcTurn = false;
                playerTurn = true;
            }
            if (eleteroNPC <= 0) {
                System.out.println("Te nyertél!");
                System.exit(0);
            }
            while (playerTurn && !npcTurn && eletero > 0) {
                System.out.println("Te következel!");
                System.out.println("Elérhető manna szint: " + mannalevelPlayer);
                System.out.println("1. = Normális támadás");
                System.out.println("2. = Villám kard");
                System.out.println("3. = Sárkány ütés");
                System.out.println("4. = Démon úr csapás");
                System.out.println("5. = Manna visszatöltés(+60)");
                System.out.println("6. = Életerő visszatöltés(+100)");
                try {
                    Scanner scanner = new Scanner(System.in);
                    int valasztas = scanner.nextInt();
                    switch (valasztas) {
                        case 1:
                            setNormalAttack(veletlen.nextInt(5, 10));
                            System.out.println("Manna költség 0, Ennyi sebzést okoztál az ellenfelednek: " + getNormalAttack());
                            eleteroNPC -= getNormalAttack();
                            System.out.println("NPC életereje: " + eleteroNPC);
                            npcTurn = true;
                            playerTurn = false;
                            break;
                        case 2:
                            if (mannalevelPlayer >= 20) {
                                setLightningSword(veletlen.nextInt(30, 50));
                                System.out.println("Manna költség 20, Ennyi sebzést okoztál az ellenfelednek: " + getLightningSword());
                                eleteroNPC -= getLightningSword();
                                mannalevelPlayer -= 20;
                                System.out.println("Új mannaszinted: " + mannalevelPlayer + " NPC életereje: " + eleteroNPC);
                                npcTurn = true;
                                playerTurn = false;
                            } else {
                                System.out.println("Nem elég manna!");
                            }
                            break;
                        case 3:
                            if (mannalevelPlayer >= 15) {
                                setDragonPunch(veletlen.nextInt(20, 40));
                                System.out.println("Manna költség 15, Ennyi sebzést okoztál az ellenfelednek: " + getDragonPunch());
                                eleteroNPC -= getDragonPunch();
                                mannalevelPlayer -= 15;
                                System.out.println("Új mannaszinted: " + mannalevelPlayer + " NPC életereje: " + eleteroNPC);
                                npcTurn = true;
                                playerTurn = false;
                            } else {
                                System.out.println("Nem elég manna!");
                            }
                            break;
                        case 4:
                            if (mannalevelPlayer >= 30) {
                                setDemonlordAttack(veletlen.nextInt(60, 120));
                                System.out.println("Manna költség 30, Ennyi sebzést okoztál az ellenfelednek: " + getDemonlordAttack());
                                eleteroNPC -= getDemonlordAttack();
                                mannalevelPlayer -= 30;
                                System.out.println("Új mannaszinted: " + mannalevelPlayer + " NPC életereje: " + eleteroNPC);
                                npcTurn = true;
                                playerTurn = false;
                            } else {
                                System.out.println("Nem elég manna!");
                            }
                        case 5:
                            if(playerTurn && mvisszatoltes <=1) {
                                System.out.println("Manna visszatöltés...");
                                mvisszatoltes += 1;
                                mannalevelPlayer += 60;
                                System.out.println("Új mannaszinted: "+mannalevelPlayer);
                                npcTurn = true;
                                playerTurn = false;
                            }
                            if (playerTurn) {
                                System.out.println("Már felhasználtad a kétszeri visszatöltést!");
                            }
                            break;
                        case 6:
                            if (mannalevelPlayer >=30 && eleterovissza == 0){
                                System.out.println("Életerő feltöltés...");
                                eletero += 100;
                                mannalevelPlayer-=30;
                                eleterovissza+=1;
                                System.out.println("Manna költség: 30, új mannaszinted: "+mannalevelPlayer);
                                System.out.println("Új életerőd: "+eletero);
                                npcTurn = true;
                                playerTurn = false;
                            } else if(mannalevelPlayer < 30){
                                System.out.println("Nem elég manna!");
                            } else if (eleterovissza == 1) {
                                System.out.println("Már felhasználtad az életerő visszatöltést!");
                            }
                            break;
                    }
                    if (valasztas != 1 && valasztas != 2 && valasztas != 3 && valasztas != 4 && valasztas != 5 && valasztas != 6) {
                        System.out.println("Nincsen ilyen opció!");
                    }
                } catch (Exception exception) {
                    System.out.println("Betűt adtál meg szám helyett!");
                    System.out.println("Indítsd újra a programot..");
                    System.exit(0);
                }
            }
            if (eleteroNPC <= 0) {
                System.out.println("Te nyertél!");
                System.exit(0);
            }
            if (eletero <= 0) {
                System.out.println("Vesztettél!");
            }
        }
    }
}
