package com.example.demo.demo.Static;

public class StaticClassTest {
    private String name;
    private String engine;

    private static int numberOfCars;

    public StaticClassTest(
        String name,
        String engine
    ){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        StaticClassTest.numberOfCars = numberOfCars;
    }
}
