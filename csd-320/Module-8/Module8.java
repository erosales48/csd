/* Edgar Rosales
 * 02May2024
 * CSD320-J318 Programming with Java (2245-DD)
 * Module 8 Assignment:
 * Write a program with four methods for calculating the cost of a yearly auto service visit.
 * The methods will be titled yearlyService.
 * yearlyService(no parameters) - Will return the standard service charge.
 * yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
 * yearlyService(two parameters) - Will return the standard service charge with an added oil change fee
 * and a tire rotation charge.
 * yearlyService(three parameters) - Will return the standard service charge with an added oil change fee,
 * a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
 * 
 * Write a main method that will test each of these methods two times.
 */

public class Module8 {

    final double stdService = 74.99;
   
    public double yearlyService() {
        double fee = stdService;
        return fee;
    }

    public double yearlyService(double oilFee) {
        double fee = stdService + oilFee;
        return fee;
    }

    public double yearlyService(double oilFee, double tireRotationFee) {
        double fee = stdService + oilFee + tireRotationFee;
        return fee;
    }

    public double yearlyService(double oilFee, double tireRotationFee, float cupon) {
        double fee = stdService + oilFee + tireRotationFee;
        double discount = (cupon / 100) * fee;
        fee -= discount;
        return fee;   
    }

    public static void main(String[] args) {
        Module8 calculate = new Module8();
        double oilChg = 34.81;
        double tirChg = 44.25;
        float disco = 10.0f;

        System.out.println("Welcome to XX Auto\n");

        // Two examples with no paramenters.
        System.out.println(" Joe got regular service fee: $" + String.format("%,.2f", calculate.yearlyService()));
        System.out.println(" Sue got regular service fee: $" + String.format("%,.2f", calculate.yearlyService()));

        // Two examples with one parameter.
        System.out.println(" Steve added oil change total charge:  $" + String.format("%,.2f", calculate.yearlyService(oilChg)));
        System.out.println(" Lisa added oil change total charge: $" + String.format("%,.2f", calculate.yearlyService(47.50)));
        
        // Two examples with two paramenters.
        System.out.println(" Daniel added oil change and tire rotation, total charge:  $" + String.format("%,.2f", calculate.yearlyService(oilChg, tirChg)));
        System.out.println(" Joshi added oil change and tire rotation, total charge:  $" + String.format("%,.2f", calculate.yearlyService(15, 42.0)));

        // Two examples with three paramenters.
        System.out.println(" David added oil change and tire rotation, total charge:  $" + String.format("%,.2f", calculate.yearlyService(oilChg, tirChg, disco)));
        System.out.println(" Rasputin added oil change and tire rotation, total charge:  $" + String.format("%,.2f", calculate.yearlyService(1500, 42.0, 90)));
    }
}