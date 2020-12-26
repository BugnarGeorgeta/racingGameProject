package org.fasttrackit;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];

    public void start() {

        initializeTracks();
        displayTraks();
        System.out.println("Starting game.");
        int numberOfPlayers = getNumberOfPlayers();
        System.out.println("In this game you have " + numberOfPlayers + " players.");
        String nameFromUser = getVehicleNameFromUser();
        System.out.println("The name for vehicle is " + nameFromUser);
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

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }


}
