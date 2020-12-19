package org.fasttrackit;

public class Vehicle {

    static int totalCount;

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private boolean running;
    private double traveledDistance;

    public Vehicle() {
        totalCount++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
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

        System.out.println("Traveled distance is " + traveledDistance + " km.");

        double usedFuel = distance * mileage * mileageMultiplier / 100;
        System.out.println("Used fuel " + usedFuel + "l.");

        fuelLevel -= usedFuel;
        System.out.println("Fuel level " + fuelLevel + "l.");

        return distance;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelLevel=" + fuelLevel +
                ", running=" + running +
                ", traveledDistance=" + traveledDistance +
                '}';
    }
}
