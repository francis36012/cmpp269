package com.fagyapong.cmpp269.assignment4.documentations.ass4_std;
import java.io.*;
/**
 * 
 */
import java.util.*;

@SuppressWarnings("unused")
public class ass4ParkingStart {
    public static void main (String [] args) throws IOException
    {
        Scanner k = new Scanner (System.in);
        

        int numCars = 0;
        int s = 0;
        boolean found;

        s = printMenu(k);
        k.nextLine();
        while (s != 22359)
        {
            switch (s)
            {
                case 1:
                    // Add a car to the lot
                    System.out.println ("Add a car here!");
                    System.out.print ("Please enter to continue...");
                    k.nextLine();

                    break;
                case 2:
                    // verify plate
                    System.out.println ("Verify a plate here!");
                    System.out.print ("Please enter to continue...");
                    k.nextLine();
                    break;
                case 22351:
                    // produce a report of all the plates
                    System.out.println ("Produce a report of all plates to the file registered.txt here!");
                    System.out.print ("Please enter to continue...");
                    k.nextLine();
                    break;
                case 22352:
                    // Produce a summary of charges
                    System.out.println ("Write a report of all charges to charges.txt here");
                    System.out.print ("Please enter to continue...");
                    k.nextLine();
                    break;
                case 22353:
                    // clear out all the cars from the parking lot
                    System.out.println ("Remove all cars from the list here!");
                    System.out.print ("Please enter to continue...");
                    k.nextLine();
                    break;
                default:
                
            }
            s = printMenu(k);
            k.nextLine();

        }
        

    }
    static public int printMenu(Scanner k)
    {
        int s = 0;
        // Clear the screen in BlueJ
        System.out.print ('\u000C');
       
        System.out.println ("Welcome to Park and Go Parking");
        System.out.println ("Park from 6 - Midnight for a flat fee of $4.00");
        System.out.println ("1. Register your vehicle");
        System.out.println ("2. Verify vehicle registration");
        System.out.print ("Hello enter a Selection: ");
        s = k.nextInt();
        return s;

    }
    // Write all your functions here!
}
