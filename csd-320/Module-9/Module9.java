/* Edgar Rosales
 * 8 May 2024
 * CSD320-J318 Programming with Java (2245-DD)
 * 
 * Module 9 Assignment
 * Write a program that reads and fills an array with 20 integers.
 * Then using the array elements, calculate the data to find and display:
 * 1. The highest value entered.
 * 2. The loweest value entered.
 * 3. The average of numbers entered.
 * 4. The sum of the numbers entered.
 */

import java.util.*;
public class Module9{

    // Method to find the highest value in the list.
    public static int topVal(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the lowest value in the list.
    public static int minVal(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to add all the vlaues on the list.
    public static int summed(List<Integer> list) {
        int sum = 0;

        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    // Main Method
    public static void main(String [] args){
        List <Integer>  list = new ArrayList <>();
        Random random = new Random(); 
        // Could add a Method to ask for user to enter 20 integers, but this is cleaner.
        // Could also just ask user to determine the range between 1 and <2 - 2147483647>.
        for(int i = 0; i < 20; ++i){
            list.add(random.nextInt(200) + 1);
        }
        // Print out the whole list so it can be compared to answers.
        System.out.println("List of random integers:");
        System.out.println(list);
        // Call method to get highest value and print it out.
        int max = topVal(list);
        System.out.println("\nHighest value in the List = " + max);
        // Call method to get lowest value and print it out.
        int min = minVal(list);
        System.out.println("\nLowest value in the list = " + min);
        // Call method to get sum of all values and print it out.
        int sum = summed(list);
        System.out.println("\nSum of all the numbers in the list = " + sum);
        // Call method to get sum of all values then divide it by the number of values to get average and print it out.
        int avg = (summed(list) / list.size());
        System.out.println("\nAverage of all numbers in the list = " + avg + "\n");
    }
}