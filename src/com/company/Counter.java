package com.company;

public class Counter {

    private static int amount;

    public Counter() {
        this.amount++;
    }

    public int getAmount() {
        return amount;
    }
}
