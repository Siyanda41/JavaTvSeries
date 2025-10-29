/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.prog6112poe;

import java.util.Scanner;

/**
 *
 * @author Siyanda
 */
public class Prog6112POE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Series series = new Series();

        System.out.println("LATEST SERIES - 2025");
        System.out.println("**************************************");

        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            int launch = scan.nextInt();

            if (launch == 1) {
                break;
            }
        }

        while (true) {
            
            //application menu
            System.out.println("\nPlease select one of the following menu items:");
            System.out.println("(1) Capture a new series");
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update series age restriction");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print series report - 2025");
            System.out.println("(6) Exit Application");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    series.CaptureSeries();
                    break;

                case 2:

                    series.SearchSeries();
                    break;

                case 3:
                    series.UpdateSeries();
                    break;

                case 4:
                    series.DeleteSeries();
                    break;

                case 5:
                    series.SeriesReport();
                    break;

                case 6:
                    series.ExitSeriesApplication();
                    break;

                default:
                    System.out.println("invalid");
            }
        }
    }
}
