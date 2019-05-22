package com.example.TheGym;

public class MemberShipLevel {

    private boolean gold = false;
    private boolean silver = false;
    private boolean bronse = false;

    public MemberShipLevel() {

    }

    public MemberShipLevel(boolean gold, boolean silver, boolean bronse) {
        this.gold = gold;
        this.silver = silver;
        this.bronse = bronse;
    }

    public boolean getGold() {
        return gold;
    }

    public boolean getSilver() {
        return silver;
    }

    public boolean getBronse() {
        return bronse;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public void setSilver(boolean silver) {
        this.silver = silver;
    }

    public void setBronse(boolean bronse) {
        this.bronse = bronse;
    }
}
