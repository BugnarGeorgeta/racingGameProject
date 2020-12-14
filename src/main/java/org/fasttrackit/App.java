package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Racing Game !");

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        Car car = new Car(carEngine);
        car.name = "Dacia";
        car.color = "red";
        car.mileage = 9.8;
        car.fuelLevel = 60;
        car.maxSpeed = 200;
        car.running = false;
        car.doorCount = 4;

        Vehicle.totalCount = 2;


        System.out.println("Engine detail " + car.engine.manufacturer + ".");

        double accelerateDistance = car.accelerate(60, 1);
        System.out.println("Acceleration distance " + accelerateDistance);


    }
}
