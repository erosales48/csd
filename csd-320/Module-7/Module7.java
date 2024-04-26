/* Edgar Rosales
 * 25 Apr 2024
 * CSD320-J318 Programming with Java (2245-DD)
 * 
 * Module 7 Assignment:
 * Some Websites impose certain rules for passwords.
 * Write a method that checks whether a user's input String is a valid password.
 * Suppose the password rules are as follows:
 * 
 * A password must have at least eight characters.
 * A password must contain both letters and digits.
 * A password must contain at least one uppercase character.
 * A password must contain at least one lowercase character.
 * 
 * The class PassValidator.class is used in this program,
 * however I was not able to "import" it as it is in the same package.
 */

import java.util.Scanner;

public class Module7 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Initialize variable for while loop
        boolean next = true;

        // Main loop will repeat if user types anyhting stating with "y"
        while (next) {
  
            System.out.print("\nEnter your password: ");
            String password = scanner.nextLine();

            // Use the PassValidator class, if it returns true it passed validation
            if (PassValidator.isValid(password)) {
                System.out.println("Valid password.");
            } else {
                System.out.println("Invalid password.");
            }

            // Ask user if they want to try another check
            System.out.print("\n\nAgain? ");
            String doagain = scanner.nextLine();
            
            // This takes the first character of the user input, then changes it to lower case
            if (!doagain.isEmpty()) {
                char firstChar = Character.toLowerCase(doagain.charAt(0));
                if (firstChar != 'y') {
                    // If the was not "y" then end the loop
                    next = false;
                }
            }
        }
        // Close the scanner bject
        scanner.close();
    }
}