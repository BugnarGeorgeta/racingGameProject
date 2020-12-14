package org.fasttrackit;

public class Vehicle {

    static int totalCount;

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    boolean running;
    double traveledDistance;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km for" + durationInHours + "h.");

        double distance = speed * durationInHours;

        traveledDistance += distance;

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Fuel level " + fuelLevel);

        return distance;
    }
}
