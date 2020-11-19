package com.company;

import com.company.classes.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class View {
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private Scanner input = new Scanner(System.in);

    public View() {
        menu = new LinkedHashMap<>();
        menu.put("1", "1 - Work with class Circle ");
        menu.put("2", "2 - Work with class Counter");
        menu.put("3", "3 - Work with class Car");
        menu.put("4", "4 - Work with class Fractional");
        menu.put("5", "5 - Work with class Money");
        menu.put("Q", "Q - Exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::pressButton1);
        methodsMenu.put("2", this::pressButton2);
        methodsMenu.put("3", this::pressButton3);
        methodsMenu.put("4", this::pressButton4);
        methodsMenu.put("5", this::pressButton5);

    }


    public void pressButton1() {
        System.out.println("Input radius");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Square: " + circle.getSquare());
    }

    public void pressButton2() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        System.out.println("Amount: " + c5.getAmount());
    }

    public void pressButton3() {
        Car car = new Car("Audi", 240);
        car.move();
        car.startUp();
        car.move();
        car.move();
        car.maintainSpeed(140);
        car.maintainSpeed(60);
        car.move();
        car.move();
        car.maintainSpeed(250);
        car.maintainSpeed(30);
        car.turnOffEngine();
    }

    public void pressButton4() {
        Fractional fr1 = new Fractional(36.45);
        Fractional fr2 = new Fractional(14.74);
        System.out.println("Objects of Fractional: " + fr1.getFractional() + " and " + fr2.getFractional());
        fr1.add(fr2);
        System.out.println("Adding: " + fr1.getFractional());
        fr1.subtract(fr2);
        System.out.println("Subtracting: " + fr1.getFractional());
        System.out.println(fr1.getFractional() + "==" + fr1.getFractional() + " is " + fr1.equals(fr1));
        fr1.multiply(fr2);
        System.out.println("Multiplying: " + fr1.getFractional());
    }

    public void pressButton5() {
        Money m1 = new Money(25.6);
        Money m2 = new Money(24.3);
        System.out.println("Objects of Money: " + m1.getMoney() + " and " + m2.getMoney());
        m1.add(m2);
        System.out.println("Adding: " + m1.getMoney());
        m1.subtract(m2);
        System.out.println("Subtracting: " + m1.getMoney());
        m1.divide(4);
        System.out.println("Divide by 4: " + m1.getMoney());
        m1.multiply(4);
        System.out.println("Multiply by 4: " + m1.getMoney());
        m1.divide(0.4);
        System.out.println("Divide by 0.4: " + m1.getMoney());
        System.out.println(m1.getMoney() + "==" + m2.getMoney() + " is" + m1.equals(m2));
    }

    private void outputMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    public void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point.");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }

}
