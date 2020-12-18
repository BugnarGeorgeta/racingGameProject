package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Racing Game !");
        Game game = new Game();
        game.start();

        Engine carEngine = new Engine();
        carEngine.setManufacturer("Renault");
        carEngine.setCapacity(1.5);


        Car car = new Car(carEngine);
        car.setName("Dacia");
        car.setColor("red");
        car.setMileage(9.8);
        car.setFuelLevel(60);
        car.setMaxSpeed(200);
        car.setRunning(false);
        car.setDoorCount(4);

        Vehicle.totalCount = 2;

        Car car2 = new Car();
        car2.setName("VW");


        System.out.println("Engine detail " + car.getEngine().getManufacturer() + ".");

        double accelerateDistance = car.accelerate(110, 1);
        System.out.println("Acceleration distance " + accelerateDistance);


    }
}
