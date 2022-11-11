package org.example.test1;

public class HyundaiFactory {

    private static HyundaiFactory HyundaiFactory = new HyundaiFactory();

    private HyundaiFactory() {}

    public static HyundaiFactory getFactory() {

        return HyundaiFactory;
    }

    public Car createCar() {
        return new Car();
    }
}
