/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112poe;

import java.util.Scanner;

/**
 *
 * @author Siyanda
 */
class Series {

    private SeriesModel[] seriesArray = new SeriesModel[100]; //array to store information
    private Scanner scan = new Scanner(System.in);
    private int seriesCount = 0;

    // first option, capturing a series
    public void CaptureSeries() {
        System.out.println("\nCAPTURE A NEW SERIES");
        System.out.println("**************************************");
        System.out.print("Enter the series id: ");
        String id = scan.nextLine();

        System.out.print("Enter the series name: ");
        String name = scan.nextLine();

        int age;
        while (true) {
            System.out.print("Enter the series age restriction: ");
            try {
                age = Integer.parseInt(scan.nextLine());
                if (age >= 2 && age <= 18) {
                    break;
                } else {
                    System.out.println("You have entered a incorrect series age!!! \nPlease re-enter the series age >>");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered a incorrect series age!!! \nPlease re-enter the series age >>");
            }
        }

        System.out.print("Enter the number of episodes for " + name + ": ");
        int episodes = Integer.parseInt(scan.nextLine());

        seriesArray[seriesCount] = new SeriesModel(id, name, age, episodes);
        seriesCount++;

        System.out.println("Series processed successfully!!");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1) {
                break;
            } else {
                ExitSeriesApplication();
            }
        }
    }

    //second option, searching for a series
    public void SearchSeries() {

        System.out.print("Enter the series id to search: ");
        String id = scan.nextLine();
        System.out.println("-----------------------------------");

        for (int i = 0; i < seriesCount; i++) {
            if (seriesArray[i].getSeriesId().equals(id)) {
                System.out.println("Series Id: " + seriesArray[i].getSeriesId());
                System.out.println("Series Name: " + seriesArray[i].getSeriesName());
                System.out.println("Series age restriction: " + seriesArray[i].getSeriesAge());
                System.out.println("Series number of episodes: " + seriesArray[i].getSeriesNumberOfEpisodes());
                System.out.println("-----------------------------------");
                return;
            }

            while (true) {
                System.out.println("Enter (1) to launch menu or any other key to exit");
                int input = Integer.parseInt(scan.nextLine());
                if (input == 1) {
                    break;
                } else {
                    ExitSeriesApplication();
                }
            }
        }

        System.out.println("Series with series id: " + id + " was not found");
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1) {
                break;
            } else {
                ExitSeriesApplication();
            }
        }
    }

    //third option, updating a series
    public void UpdateSeries() {
        System.out.println("Enter the series id to update: ");
        String id = scan.nextLine();

        for (int i = 0; i < seriesCount; i++) {
            if (seriesArray[i].getSeriesId().equals(id)) {
                System.out.println("Enter the series name: ");
                seriesArray[i].setSeriesName(scan.nextLine());

                int age;

                while (true) {
                    System.out.println("Enter the age restriction: ");
                    try {
                        age = scan.nextInt();
                        if (age >= 2 && age <= 18) {
                            seriesArray[i].setSeriesAge(age);
                            break;
                        } else {
                            System.out.println("Invalid! Must be between 2 and 18");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid");
                    }
                }

                System.out.println("Enter the number of episodes: ");
                seriesArray[i].setSeriesNumberOfEpisodes(scan.nextInt());

                System.out.println("Series updated successfully");
                return;
            }
        }
        System.out.println("Series with series id: " + id + "was not found");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1) {
                break;
            } else {
                ExitSeriesApplication();
            }
        }
    }

    //forth option, Deleting a series
    public void DeleteSeries() {
        System.out.println("Enter the series Id to delete: ");
        String id = scan.nextLine();
        System.out.println("-----------------------------------");

        for (int i = 0; i < seriesCount; i++) {
            if (seriesArray[i].getSeriesId().equals(id)) {
                System.out.println("Are you sure you want to delete" + id + "? Yes (y) to delete.");
                if (scan.nextLine().equalsIgnoreCase("y")) {
                    for (int j = i; j < seriesCount - 1; j++) {
                        seriesArray[j] = seriesArray[j + 1];
                    }
                    seriesArray[seriesCount - 1] = null;
                    seriesCount--;
                    System.out.println("Series with Series Id: " + id + "was deleted!");
                } else {
                    System.out.println("Delete cancelled.");
                }
                return;
            }
        }
        System.out.println("Series with series id: " + id + "was not found");
        System.out.println("-----------------------------------");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1) {
                break;
            } else {
                ExitSeriesApplication();
            }
        }
    }

    //fifth option, get a series report
    public void SeriesReport() {
        System.out.println("----------------------------------------------");
        System.out.println("TV Series Report - 2025");
        System.out.println("----------------------------------------------");
        if (seriesCount == 0) {
            System.out.println("No series captured yet.");
        } else {
            for (int i = 0; i < seriesCount; i++) {
                System.out.println("Series " + (i + 1));
                System.out.println("\n----------------------------------------------");
                System.out.println("SERIES ID: " + seriesArray[i].getSeriesId());
                System.out.println("SERIES NAME: " + seriesArray[i].getSeriesName());
                System.out.println("SERIES AGE RESTRICTION: " + seriesArray[i].getSeriesAge());
                System.out.println("NUMBER OF EPISODES: " + seriesArray[i].getSeriesNumberOfEpisodes());
                System.out.println("----------------------------------------------");
            }
        }

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int input = Integer.parseInt(scan.nextLine());
            if (input == 1) {
                break;
            } else {
                ExitSeriesApplication();
            }
        }
    }

    //option 6, exiting an application
    public void ExitSeriesApplication() {
        System.out.println("Exiting application...");
        System.exit(0);
    }

}
