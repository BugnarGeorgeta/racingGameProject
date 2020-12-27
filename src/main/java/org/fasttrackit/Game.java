package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() {
        System.out.println("Starting game.");

        initializeTracks();
        displayTraks();
        initializecompetitors();

        for (Vehicle vehicle : competitors)
            System.out.println("It's turn to " + vehicle.getName() + ".");


    }

    private int getNumberOfPlayers() {
        System.out.println("Please enter how many players do you want in this game: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    private void initializeTracks() {

        Track track1 = new Track();
        track1.setName("SilverStone");
        track1.setLength(4.5);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transilvania");
        track2.setLength(4.7);

        tracks[1] = track2;
    }

    private void displayTraks() {
        System.out.println("Available tracks :");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + "." + tracks[i].getName()
                        + " - " + tracks[i].getLength() + "km.");
            }
        }
    }

    private void initializecompetitors() {
        int numberOfPlayers = getNumberOfPlayers();
        System.out.println("In this game you have " + numberOfPlayers + " players.");

        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUser());
        vehicle.setFuelLevel(80);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4.5, 10));
        vehicle.setMaxSpeed(ThreadLocalRandom.current().nextDouble(200, 350));

        competitors.add(vehicle);

        System.out.println(vehicle.getName() + " have mileage " + vehicle.getMileage() +
                "km/h");

    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }


}
