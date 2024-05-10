/* Edgar Rosales
 * 9 May 2024
 * CSD320-J318 Programming with Java (2245-DD)
 *
 * Write four overloaded methods that return the average of an array with the following headers:
 * public static short average(short [] array)
 * public static int average(int [] array)
 * public static long average(long [] array)
 * public static double average(double [] array)
 * Write a test program that invokes each of these methods and then displays the average value returned
 *  along with a display of the original array elements. Ensure the display is easy to read and understandable.
 * Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written.
 */

 import java.text.DecimalFormat;

 public class Average {
     // Overloaded Method for short
     public static short average(short[] array) {
         short nSum = 0;
         for (short value : array) {
             nSum += value;
         }
         nSum /= (short) array.length;
         return nSum;
     }
     // Overloaded Method for int
     public static int average(int[] array) {
         int nSum = 0;
         for (int j : array) {
             nSum += j;
         }
         nSum /= array.length;
         return nSum;
     }
     // Overloaded Method for long
     public static long average(long[] array) {
         long nSum = 0;
         for (long l : array) {
             nSum += l;
         }
         nSum /= array.length;
         return nSum;
     }
     // Overloaded Method for double
     public static double average(double[] array) {
         double nSum = 0;
         for (double v : array) {
             nSum += v;
         }
         nSum /= array.length;
         return nSum;
     }
     // Overloaded Method to display array elements for short
     public static void displayArray(short[] array) {
         DecimalFormat df = new DecimalFormat("#,###");
         for (short num : array) {
             System.out.print(df.format(num) + " : ");
         }
     }
     // Overloaded Method to display array elements for int
     public static void displayArray(int[] array) {
         DecimalFormat df = new DecimalFormat("#,###");
         for (int num : array) {
             System.out.print(df.format(num) + " : ");
         }
     }
     // Overloaded Method to display array elements for long
     public static void displayArray(long[] array) {
         DecimalFormat df = new DecimalFormat("#,###");
         for (long num : array) {
             System.out.print(df.format(num) + " : ");
         }
     }
     // Overloaded Method to display array elements for double
     public static void displayArray(double[] array) {
         DecimalFormat df = new DecimalFormat("#,###.##");
         for (double num : array) {
             System.out.print(df.format(num) + " : ");
         }
     }
     // Main Method
     public static void main(String[] args) {
        // Define the arrays
         short[] shortArray = {1, 5, 7, 11, 13, 17};
         int[] intArray = {35000, 425435, 423545, 9872456, 345678};
         long[] longArray = {2147483700L, 4147600647L, 3147483647L, 5147483647L, 6147483647L};
         double[] doubleArray = {66.6, 392.5, 3.14, 45535.35};
 
         // Display original arrays
         System.out.print("Original Short Array: ");
         displayArray(shortArray);
         System.out.print("\nOriginal Int Array: ");
         displayArray(intArray);
         System.out.print("\nOriginal Long Array: ");
         displayArray(longArray);
         System.out.print("\nOriginal Double Array: ");
         displayArray(doubleArray);
         System.out.println();
 
         //Call average Method and display result
         DecimalFormat df = new DecimalFormat("#,###.##");
         System.out.println("\nAverage of Short Array: " + df.format(average(shortArray)));
         System.out.println("\nAverage of Integer Array: " + df.format(average(intArray)));
         System.out.println("\nAverage of Long Array: " + df.format(average(longArray)));
         System.out.println("\nAverage of Double Array: " + df.format(average(doubleArray)));
     }
 }