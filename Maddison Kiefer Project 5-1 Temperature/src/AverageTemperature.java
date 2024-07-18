//@author Maddison Kiefer

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        // Declaring the arrays
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double[] temperature = {75, 82, 77, 91, 79, 73, 87};
        Scanner scnr = new Scanner(System.in);
        
        // Getting a user input for the day
        System.out.println("Please enter a day of the week (Monday-Sunday), or enter 'week' to see the weekly average: ");
        String input = scnr.nextLine();
        
        // If the user input 'week' then the average and days will all be displayed
        if(input.equalsIgnoreCase("week")) {
            double totalTemp = 0;
            System.out.println();
            System.out.println("Temperatures for each day and the weekly average: ");
            
            // Loop to display each day with corresponding temperature
            for (int i = 0; i < days.length; i++) {
                totalTemp += temperature[i];
                System.out.println(days[i] + " - " + temperature[i] + " degrees");
            }
            
            // Calculating the average temperature
            double averageTemp = (double) totalTemp / days.length;
            System.out.printf("The average temperature for the week is: %.2f degrees\n", averageTemp);
        } 
        else {
            // Otherwise, the input day will be displayed with the temperature
            boolean result = false;
            System.out.println();
            System.out.println("Day of the week and temperature of the day: ");
            // For loop to display temperature for the input day, loop ends when a the match is found
            for (int i = 0; i < days.length; i++) {
                if (input.equalsIgnoreCase(days[i])) {
                    System.out.println(days[i] + " - " + temperature[i] + " degrees");
                    result = true;
                    break;
                }
            }
            // Checks that the input is valid
            if (!result) {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }
    }
}
