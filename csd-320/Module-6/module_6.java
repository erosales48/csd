public class module_6 {
    public static void main(String[] args) {
        // Define the number of rows
        int rows = 7;

        // Loop through each row
        for (int space = 0; space < rows; space++) {

            // Print spaces for formatting
            if (space < 5) {
                System.out.print("  ");
            }
            if (space == 5) {
                System.out.print(" ");
            }
            
            for (int column = 0; column < 2 * (rows - space - 1); column++) {
                System.out.print(" ");
            }
            

            // Print the left half of the pattern
            for (int column = 0; column <= space; column++) {
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print the right half of the pattern
            for (int column = space - 1; column >= 0; column--) {
                System.out.print((int) Math.pow(2, column) + " ");
            }

            // Print spaces after for formatting
            for (int column = 0; column < 2 * (rows - space - 1); column++) {
                System.out.print(" ");
            }
            if (space < 4) {
                System.out.print("   ");
            }
            if (space == 4) {
                System.out.print("  ");
            }
            if (space == 5) {
                System.out.print(" ");
            }

            // Print @ symbol
            System.out.println("@");
        }
    }
}