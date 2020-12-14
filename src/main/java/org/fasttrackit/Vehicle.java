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

        double mileageMultiplier = 1;


        if (speed > maxSpeed) {
            System.out.println("Maximum speed exceeded");
        } else if (speed == maxSpeed) {
            System.out.println("Careful!Max speed reached");
        } else {
            System.out.println("Valid speed entered.");
        }


        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel!");
        }

        System.out.println(name + " is accelerating with " + speed + " km for" + durationInHours + "h.");


        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double distance = speed * durationInHours;

        traveledDistance += distance;

        double usedFuel = distance * mileage * mileageMultiplier / 100;
        System.out.println("Used fuel " + usedFuel + "l.");

        fuelLevel -= usedFuel;
        System.out.println("Fuel level " + fuelLevel + "l.");

        return distance;
    }
}
