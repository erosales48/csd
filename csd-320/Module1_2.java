/** Edgar Rosales
 *  CSD-320-J318 Programming with Java (2245-DD)
 *  Module 1.2 Assigment
 *   Write a programm that displays the results of:
 *      4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
 *   And
 *      4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
 *  In the comments, add a discussion on the difference between the two outputs and the cause.
 *  Which is best? Why?
 */

 public class Module1_2 {
    public static void main(String[] args) {
      // print problem them print result in the same line
      System.out.print(" 4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ) = ");
      System.out.println( 4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
      System.out.println();
      System.out.println();
      System.out.print( "4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ) = ");
      System.out.println( 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 ));
    }
 }
