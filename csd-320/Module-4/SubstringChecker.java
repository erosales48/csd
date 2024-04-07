/* Edgar Rosales
 * 7 April 2024
 * CSD320-j318 Programming with Java (2245-DD)
 * Module 4.2 assignment:
 * Write a program that prompts a user to enter two strings and then
 * checks the strings entered and reports if either the first string is
 * a substring of the second string, or if the second string is a substring
 * of the first string.
 */

import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        // Initilaize scanner
        Scanner scanner = new Scanner(System.in);

        //Welcome message
        System.out.println("Welcome to substring checker\n");

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if either string as a whole is a substring of the other, ignoring case
        if (str1.toLowerCase().contains(str2.toLowerCase())) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\"");
        } else if (str2.toLowerCase().contains(str1.toLowerCase())) {
            System.out.println("\"" + str1 + "\" is a substring of \"" + str2 + "\"");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        // Close scanner as enforced by VSCode
        scanner.close();
    }
}