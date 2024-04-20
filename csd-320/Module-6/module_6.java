/* Edgar D Rosales
 * 19 Apr 2024
 * CSD-320-J318 Programming with Java (2245-DD)
 * Module 6.2 Assignment
 * Write a program that uses nested for loops to output the following with the shown display format:
 * (display omitted)
 */
public class module_6 {
    public static void main(String[] args) {
        // Define the number of rows
        int maxRows = 7;

        // Loop through each line until max rows is hit
        for (int line = 0; line < maxRows; line++) {

            // Print spaces for formatting       
            for (int column = 0; column < 3 * (maxRows - line - 1); column++) {
                System.out.print(" ");
            }
                       
            // Print the left half of the pattern with a space added for single digits
            for (int column = 0; column <= line; column++) {
                if (Math.pow(2,column) < 10) {
                    System.out.print(" ");
                }
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print the right half of the pattern with a space added for single digits
            for (int column = line - 1; column >= 0; column--) {
                if (Math.pow(2,column) < 10) {
                    System.out.print(" ");
                }
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print spaces after for formatting
            for (int column = 0; column < 3 * (maxRows - line - 1); column++) {
                System.out.print(" ");
            }
          
            // Print @ symbol
            System.out.println("@");
        }
    }
}