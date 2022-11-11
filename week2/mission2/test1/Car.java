package org.example.test1;

public class Car {

    private static int carNo = 1000;

    public static int Car() {
        return carNo++;
    }

    public int showCarNumber() {
        return Car();
    }
}
