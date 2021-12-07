package com.company;

public class Skills {
    private int lightningSword;
    private int dragonPunch;
    private int demonlordAttack;
    private int normalAttack;

    public Skills(int lightningSword, int dragonPunch, int demonlordAttack, int normalAttack) {
        this.lightningSword = lightningSword;
        this.dragonPunch = dragonPunch;
        this.demonlordAttack = demonlordAttack;
        this.normalAttack = normalAttack;
    }

    public int getLightningSword() {
        return lightningSword;
    }

    public void setLightningSword(int lightningSword) {
        this.lightningSword = lightningSword;
    }

    public int getDragonPunch() {
        return dragonPunch;
    }

    public void setDragonPunch(int dragonPunch) {
        this.dragonPunch = dragonPunch;
    }

    public int getDemonlordAttack() {
        return demonlordAttack;
    }

    public void setDemonlordAttack(int demonlordAttack) {
        this.demonlordAttack = demonlordAttack;
    }

    public int getNormalAttack() {
        return normalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        this.normalAttack = normalAttack;
    }
}
