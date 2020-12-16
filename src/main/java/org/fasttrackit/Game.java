package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Starting game.");
        int numberOfPlayers = getNumberOfPlayers();
        System.out.println("In this game you have " + numberOfPlayers + " players.");
        String nameFromUser = getVehicleNameFromUser();
        System.out.println("The name for vehicle is " + nameFromUser);
    }

    private int getNumberOfPlayers() {
        System.out.println("Please enter how many players do you want in this game: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }


}
