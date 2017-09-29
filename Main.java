import java.util.Scanner;
public class Main {

    public static void main(String args[]){

        //User input and error messages for the user input
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        int milesPerGallon = input.nextInt();
        if (milesPerGallon <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
       double tankCapacity = input.nextDouble();
        if (tankCapacity <= 0.0) {
            System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        double percentGasInTank = input.nextDouble();
        if (percentGasInTank < 0 || percentGasInTank > 100) {
            System.out.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            return;
        }
        //Calculating remaining miles
        int rawMileRange = (int)(milesPerGallon * tankCapacity * (percentGasInTank * 0.01));
        if (rawMileRange <= 25) {
            System.out.println("Attention! Your current estimated range is running low: " + rawMileRange + " miles left!!!");
        }
        else{
            System.out.println("Keep driving! Your estimated range is: " + rawMileRange + " miles!");
        }


    }

}
