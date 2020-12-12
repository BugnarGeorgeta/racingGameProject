package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Racing Game !");

        Car car = new Car();
        car.name = "Dacia";
        car.color = "red";
        car.mileage = 9.8;
        car.fuelLevel = 60;
        car.maxSpeed = 200;
        car.running = false;
        car.doorCount = 4;

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        car.engine = carEngine;

        System.out.println("Engine detail " + car.engine.manufacturer + ".");


    }
}
