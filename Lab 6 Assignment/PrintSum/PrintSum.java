//Section- 09
//Language- Java
//Name- Rutvik marakana
//Instructor- Shweta Khandal

import java.util.Scanner;
//Program to print the sum of all numbers till the input value of the number from the user
class PrintSum
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter an integer: ");//Asks the user to enter an integer value
       int a=sc.nextInt();//Stores the input integer from the user in variable a
       int b=1;
       int sum=0;
       
       System.out.println("You entered: "+a);//Prints the input integer
       while(b<=a)
       {
          sum=sum+b;
          b++;
       }
       if(a>1 && a<=100){
       System.out.println("Sum of values: "+sum);//Prints the sum of all the intgers till the input integer from the user
       }
       else{
         System.out.println("Invalid Input. Try again");//Prints that the input value is invalid and asks the user to try again
       }
   }
}
       