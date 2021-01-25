//Class- Java
//Section - 09
//Term - Fall 2018
//Instructor - Shweta Khandal
//Name - Rutvik Marakana

import java.util.Scanner;
class MinMaxAvg
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes user input for 3 intgers
       System.out.print("Enter 1st integer: ");//Asks the user to enter 1st integer
       int x=sc.nextInt();//Stores the 1st integer in variable x
       System.out.print("Enter 2nd integer: ");//Asks the user to enter 2nd integer
       int y=sc.nextInt();//Stores the 2nd integer in variable y
       System.out.print("Enter 3rd integer: ");//Asks the user to enter 3rd integer
       int z=sc.nextInt();//Stores the 3rd integer in variable z
       
       int max=max(x,y,z);
       int min=min(x,y,z);
       double avg=average(x,y,z);
       
       System.out.println("You entered: "+x+","+y+","+z);
       System.out.println("Max Value: "+max);
       System.out.println("Min Value: "+min);
       System.out.println("Average Value: "+avg);
       
    }
    public static int max(int num1,int num2,int num3)
    { 
      int max=0;
      if(num1>num2 && num1>num3)
      {
        max=num1;
      }
      else if(num2>num1 && num2>num3)
      {
        max=num2;
      }
      else
      {
        max=num3;
      }
      return max;
    }
    public static int min(int num1,int num2,int num3)
    { 
      int min=0;
      if(num1<num2 && num1<num3)
      {
        min=num1;
      }
      if(num2<num1 && num2<num3)
      {
        min=num2;
      }
      else
      {
        min=num3;
      }
      return min;
    }
    public static double average(int num1,int num2,int num3)
    {
      int sum=num1+num2+num3;
      double avg=sum/3.0;
      return avg;
    }
 }