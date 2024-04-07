/* 
 * Edgar Rosales
 * 30 Mar 2024
 * CSD320-J318 Programming with Java (2245-DD)
 * 
 * Module 2.2 Programming assignment:
 * Write a program that calculates the energy needed to heat water from an
 * initial temperature to a final temperature. Your program should prompt the user
 * to enter the amount of water in kilograms and the initial and final temperature of the water.
 * 
 * The Formula to use for this program is:
 * Q = waterMass ( finalTemperature - initialTemperature ) x 4184
 * waterMass is water weight in kilograms
 * finalTemperature and initialTemperature are temperatures in Celcius
 * Q is the result in Joules.
 * 
 */
// import scanner for input
import java.util.Scanner;

// decalre class
public class EnergyCalculator {
    // main program
    public static void main(String[] args) {
        // Try wrapper added by VSCode, define scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Joules needed to heat water calculator");
            System.out.println();

            // Request mass
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = scanner.nextDouble();

            // Request initial temperature
            System.out.print("Enter the initial temperature of the water in Celsius: ");
            double initialTemperature = scanner.nextDouble();

            // Request final temperature
            System.out.print("Enter the final temperature of the water in Celsius: ");
            double finalTemperature = scanner.nextDouble();

            // Constant given for formula, internet thinks this should be 4187 Joules per kilogram!
            double heatCapacity = 4184;

            // Calculate the energy needed
            double energyNeeded = waterMass * (finalTemperature - initialTemperature) * heatCapacity;

            System.out.println("Energy needed to heat " + waterMass + "kg of water from " + initialTemperature +
                    "°C to " + finalTemperature + "°C is " + energyNeeded + " Joules.");
        }
    }
}