/* Edgar Rosales
 * 14 April 2024
 * CSD320-j318 Programming with Java (2245-DD)
 * Module 5.2 Assignment:
 * Write a program that uses a while loop to display the following math operations
 * both in the smaller to larger order and then the larger to smaller order
 * with the denominator being 3 through 99.
 * Ensure your application displays the mathematical results.
 * Example:
 *    1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 *    1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 */
public class Module5_2 {
    public static void main(String[] args) {
        // Smaller to larger order
        double sum1 = 0;
        System.out.println("Smaller to Larger Order:");
        int denominator = 3;
        while (denominator <= 99) {
            sum1 += 1.0 / denominator;
            System.out.print("1/" + denominator + " + ");
            denominator += 2;
        }
        System.out.println("\nSum: " + sum1);

        // Larger to smaller order
        double sum2 = 0;
        System.out.println("\nLarger to Smaller Order:");
        denominator = 99;
        while (denominator >= 3) {
            sum2 += 1.0 / denominator;
            System.out.print("1/" + denominator + " + ");
            denominator -= 2;
        }
        System.out.println("\nSum: " + sum2);
    }
}
