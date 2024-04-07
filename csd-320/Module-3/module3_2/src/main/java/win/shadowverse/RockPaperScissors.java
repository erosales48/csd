/* Edgar Rosales
 * 07 April 2024
 * CSD-320-J318 Programming with Java (2245-DD)
 * Module 3.2 Assignment: 
 * Write a program that is similar to the popular game titled “Rock-Paper-Scissors.”
 * The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
 * Then, the program is to prompt the user to enter a value of 1, 2, or 3. 
 * Next, the program displays a clear readable message displaying both the computer’s selection,
 * the user’s selection, and the results.
 * version 2
 */

// Attemptiong to use maven, take 2 still my own domain 
package win.shadowverse;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Welcome message
        System.out.println("Welcome to the front Helldiver\nAn evil Automaton robot has chllenged you to:");
        System.out.println("\n\tROCK - PAPER - SCISSORS");

        //Start of main loop
        while (true) {
            // Print options
            System.out.println("Make your deomcratic choice:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            int userChoice = scanner.nextInt();
            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid choice. Do I need to report you to the democracy officer!");
                System.out.println("Enter a number between 1 and 4.");
                continue;
            }

            if (userChoice == 4) {
                System.out.println("Thanks for spreading managed democracy. Goodbye!");
                break;
            }

            String[] factors = {"Rock", "Paper", "Scissors"};
            int robotChoice = random.nextInt(3); // Generates a random number between 1 and 3

            System.out.println("You have chosen: " + factors[userChoice - 1]);
            System.out.println("The Evil Automaton robot chose: " + factors[robotChoice]);

            // Determine the winner
            if (userChoice == robotChoice + 1) {
                System.out.println("It's a Tie... are you a robot sympatizer?");
            } else if ((userChoice == 1 && robotChoice == 1) ||
                       (userChoice == 2 && robotChoice == 2) ||
                       (userChoice == 3 && robotChoice == 0)) {
                System.out.println("The Automatons win, report to your democracy officer!");
            } else {
                System.out.println("You have won, continue spreading managed democracy!");
            }
        }

        scanner.close();
    }
}
