package com.company.classes;

public class Car {

    private String name;
    private int currentSpeed;
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void startUp() {
        currentSpeed += 10;
        System.out.println("Car " + name + " starts up");
    }

    public void move() {
        if (currentSpeed == 0) {
            System.out.println("Car doesn't start up");
            return;
        } else if (currentSpeed < maxSpeed) {
            currentSpeed += 5;
            System.out.println("Car is moving. Current speed is " + currentSpeed);
        } else if (currentSpeed >= maxSpeed) {
            System.out.println("Car is moving too fast");
        }
    }

    public void turnOffEngine() {
        if (currentSpeed > 0) {
            brake();
        }
        System.out.println(name + "'s engine is turn off");
    }

    public void maintainSpeed(int speed) {
        if (speed > maxSpeed) {
            System.out.println("You can't move faster than max speed(" + maxSpeed + ")");
            return;
        }
        if (speed < currentSpeed) {
            System.out.println(name + "'s is slowing down");
            while (currentSpeed != speed) {
                currentSpeed--;
            }
        } else if (speed > currentSpeed) {
            System.out.println(name + "'s is speeding up");
            while (currentSpeed != speed) {
                currentSpeed++;
            }
        }
        System.out.println(name + "'s speed is " + currentSpeed);
    }

    private void brake() {
        while (currentSpeed != 0) {
            currentSpeed -= 5;
            System.out.println("Current speed is " + currentSpeed);
        }
    }
}
