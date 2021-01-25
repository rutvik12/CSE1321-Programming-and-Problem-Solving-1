import java.util.Scanner;
class DrivingCost
{
     public static void main(String [] args)

     {
        Scanner sc=new Scanner(System.in);//Takes user input for distance,fuel efficiency,fuel cost,fuel quantity
        int Distance=sc.nextInt();
        int fuel_efficiency=sc.nextInt();
        double fuel_cost=sc.nextDouble();
        int fuel_quantity=Distance/fuel_efficiency;
        double trip_cost=fuel_quantity*fuel_cost;//Calculates cost of the trip
        
        System.out.println("Distance travelled (miles):"+Distance);
        System.out.println("Miles per gallon (miles):"+fuel_efficiency);
        System.out.println("Price per gallon (dollars):"+fuel_cost);
        System.out.println("Trip cost (dollars):"+trip_cost);
     }

}