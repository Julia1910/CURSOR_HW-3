package com.company.classes;

public class Counter {

    private static int amount;

    public Counter() {
        this.amount++;
    }

    public int getAmount() {
        return amount;
    }
}
