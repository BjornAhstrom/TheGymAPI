package com.example.TheGym;

public class MembershipGold {

    private int mounthly;
    private int yearly;

    public MembershipGold(int mounthly, int yearly) {
        this.mounthly = mounthly;
        this.yearly = yearly;
    }

    public int getMounthly() {
        return mounthly;
    }

    public int getYearly() {
        return yearly;
    }

    public void setMounthly(int mounthly) {
        this.mounthly = mounthly;
    }

    public void setYearly(int yearly) {
        this.yearly = yearly;
    }
}
