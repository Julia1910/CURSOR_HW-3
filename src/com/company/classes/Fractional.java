package com.company.classes;

public class Fractional {
    private long integer;
    private short fraction;

    public Fractional(double number) {
        integer = (long) number;
        fraction = (short) ((number - integer) * 100);
    }

    public long getInteger() {
        return integer;
    }

    public short getFraction() {
        return fraction;
    }

    public void add(Fractional fractional) {
        integer += fractional.getInteger();
        fraction += fractional.getFraction();
        if (fraction > 100) {
            fraction = (short) (fraction - 100);
            integer++;
        }
    }

    public void subtract(Fractional fractional) {
        integer -= fractional.getInteger();
        fraction -= fractional.getFraction();
        if (fraction < 0) {
            fraction = (short) (fraction + 100);
            integer--;
        }
    }

    public void multiply(Fractional fractional) {
        double number = (double) integer + ((double) fraction / 100);
        double anotherNumber = (double) fractional.integer + ((double) fractional.fraction / 100);
        number *= anotherNumber;
        integer = (long) number;
        fraction = (short) ((number - integer) * 10000);
    }

    public boolean equals(Fractional fractional) {
        return (integer == fractional.getInteger()) && (fraction == fractional.getFraction());
    }

    public String getFractional() {
        return integer + "." + fraction;
    }

}
