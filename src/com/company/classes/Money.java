package com.company.classes;

public class Money {
    private long uah;
    private byte kopeck;

    public Money(double insert) {
        uah = (long) insert;
        kopeck = (byte) ((insert - uah) * 100);
    }

    public void showMoney() {
        System.out.println(uah + "," + kopeck);
    }

    public long getUah() {
        return uah;
    }


    public byte getKopeck() {
        return kopeck;
    }


    public void add(Money money) {
        uah += money.getUah();
        int temp = kopeck + money.getKopeck();
        if (temp > 100) {
            uah++;
            kopeck = (byte) (temp - 100);
        } else kopeck = (byte) temp;
    }

    public void subtract(Money money) {
        kopeck -= money.getKopeck();
        uah -= money.getUah();
        if (kopeck < 0) {
            kopeck = (byte) (100 + kopeck);
            uah--;
        }
    }

    public boolean equals(Money money) {
        return (uah == money.getUah()) && (kopeck == money.getKopeck());
    }

    public void divide(int number) {
        double money = uah + ((double) kopeck / 100);
        money /= number;
        uah = (long) money;
        kopeck = (byte) ((money - uah) * 100);
    }

    public void divide(double number) {
        double money = uah + ((double) kopeck / 100);
        money /= number;
        uah = (long) money;
        kopeck = (byte) ((money - uah) * 100);
    }

    public void multiply(double number) {
        double money = uah + ((double) kopeck / 100);
        money *= number;
        uah = (long) money;
        kopeck = (byte) ((money - uah) * 100);
    }

}
