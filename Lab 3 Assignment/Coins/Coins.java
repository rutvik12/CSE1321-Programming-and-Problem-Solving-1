// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
class Coins
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Reads the input value for number of quarters,dimes,nickels and pennies
       int quarters=sc.nextInt();//Stores the number of quaters in quarters
       int dimes=sc.nextInt();//Stores the number of dimes in dimes
       int nickels=sc.nextInt();//Stores the number of nickels in nickels
       int pennies=sc.nextInt();//Stores the number of pennies in pennies
       
       int dollars= (quarters/4)+(dimes/10)+(nickels/20)+(pennies/100);
       int cents=((quarters % 4)*25)+((dimes % 10)*10)+((nickels % 20)*5)+((pennies % 100)*1);
       if(cents/100>=1)
       {
          dollars=dollars+(cents/100);
          cents=cents % 100;
       }
             
       System.out.println("Entered number of quarters "+quarters);
       System.out.println("Entered number of dimes "+dimes);
       System.out.println("Entered number of nickels "+nickels);
       System.out.println("Entered number of pennies "+pennies);
       System.out.println("Your total is "+dollars+" Dollars and "+cents+" cents");
   }
}
       
 