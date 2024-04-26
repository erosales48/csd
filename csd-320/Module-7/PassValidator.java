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
 * This looks like a great opportuinity to create and use a class
 * to pass a password validation in any other program
 */

public class PassValidator {

    // Method for checking the password
    public static boolean isValid(String password) {
        // Check if the password length is at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains both letters and digits
        boolean hasLetter = false;
        boolean hasDigit = false;
        for (char index : password.toCharArray()) {
            if (Character.isLetter(index)) {
                hasLetter = true;
            } else if (Character.isDigit(index)) {
                hasDigit = true;
            }
        }
        if (!hasLetter || !hasDigit) {
            return false;
        }

        // Check if the password contains at least one uppercase character
        boolean hasUppercase = false;
        for (char index : password.toCharArray()) {
            if (Character.isUpperCase(index)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Check if the password contains at least one lowercase character
        boolean hasLowercase = false;
        for (char index : password.toCharArray()) {
            if (Character.isLowerCase(index)) {
                hasLowercase = true;
                break;
            }
        }
        // all other tests have passed, returning last true value
        return hasLowercase;
    }
}
