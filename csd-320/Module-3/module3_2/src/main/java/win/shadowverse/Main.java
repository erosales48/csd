/* Edgar Rosales
 * 07 April 2024
 * CSD-320-J318 Programming with Java (2245-DD)
 * Module 3.2 Assignment: 
 * Write a program that is similar to the popular game titled “Rock-Paper-Scissors.”
 * The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
 * Then, the program is to prompt the user to enter a value of 1, 2, or 3. 
 * Next, the program displays a clear readable message displaying both the computer’s selection,
 * the user’s selection, and the results.
 */

 // packaging for the win, yes that's my own domain
package win.shadowverse;

// could have just imported util.* but I want to be more precise
import java.util.Scanner;
import java.util.Random;

// the project picks the name Main by default, and im not fighting it.
public class Main {
    public static void main(String[] args) {
        // Initialize scanner.
        Scanner scanner = new Scanner(System.in);

        // Create Menu for user input
        System.out.println("Welcome to Rock-Paper-Scissors.\n\n");
        System.out.println("Enter 1 for Rock.");
        System.out.println("Enter 2 for Paper.");
        System.out.println("Enter 3 for Scissors.\n\n");

        System.out.print("Enter value (1, 2, or 3): ");
        int userValue = scanner.nextInt();
   
        
        // Initialize Random
        Random random = new Random();

        // Make the Automaton choice
        System.out.println("\nRolling Rolling Rolling...");
        int atomatonChoice = (random.nextInt(3)) + 1;

        // Show the results
        String automatonWin = "The Automatons win, report to your democracy officer!";
        String userWin = "You have won, continue spreading managed democracy!";
        String tie = "It's a Tie... are you a robot sympatizer?";
        String s1 = "Rock";
        String s2 = "Paper";
        String s3 = "Scissors";
       
        if (userValue == 1 && atomatonChoice == 1) {
            System.out.println("You Picked " + s1 + " and robot picked " + s1 + "!\n" + tie);
        } else if (userValue == 2 && atomatonChoice == 1) {
            System.out.println("You Picked " + s2 + " and robot picked " + s1 + "!\n" + userWin);
        } else if (userValue == 3 && atomatonChoice == 1) {
            System.out.println("You Picked " + s3 + " and robot picked " + s1 + "!\n" + automatonWin);
        } else if (userValue == 1 && atomatonChoice == 2) {
            System.out.println("You Picked " + s1 + " and robot picked " + s2 + "!\n" + automatonWin);
        } else if (userValue == 2 && atomatonChoice == 2) {
            System.out.println("You Picked " + s2 + " and robot picked " + s2 + "!\n" + tie);
        } else if (userValue == 3 && atomatonChoice == 2) {
            System.out.println("You Picked " + s3 + " and robot picked " + s2 + "!\n" + userWin);
        } else if (userValue == 1 && atomatonChoice == 3) {
            System.out.println("You Picked " + s1 + " and robot picked " + s3 + "!\n" + userWin);
        } else if (userValue == 2 && atomatonChoice == 3) {
            System.out.println("You Picked " + s2 + " and robot picked " + s3 + "!\n" + automatonWin);
        } else {
            System.out.println("You Picked " + s3 + " and robot picked " + s3 + "!\n" + tie);
        }
        
        //Close the scanner
        scanner.close();
    }
}