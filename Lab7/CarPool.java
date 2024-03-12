import java.util.Scanner;
public class CarPool {
    /*
    * Total Cost Per Day = Total Miles Driven Per Day / Average Miles Per Gallon
    * * Cost Per Gallon + Parking Fees Per Day + Tolls Per Day
    * Savings Per Day = Total Cost Per Day * Number of Extra Passengers.
    */ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The program calculates the daily driving costs and the money saved by car pooling.\n");
        System.out.print("Enter number of extra passengers (besides the driver): ");
        int passengers = input.nextInt();
        System.out.print("Enter miles driven per day: ");
        double miles = input.nextDouble();
        System.out.print("Enter the average miles per gallon your car can handle: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter the cost per gallon of gas: ");
        double costPerGallon = input.nextDouble();
        System.out.print("Enter the parking fees per day: ");
        double parkingFees = input.nextDouble();
        System.out.print("Enter the tolls per day: ");
        double tolls = input.nextDouble();
        double totalCostPerDay = (miles / milesPerGallon) * costPerGallon + parkingFees + tolls;
        double savingsPerDay = totalCostPerDay * passengers;
        System.out.printf("The total cost per day is $%.2f%n", totalCostPerDay);
        System.out.printf("The savings per day is $%.2f%n", savingsPerDay);
    }
}
