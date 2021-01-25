import java.util.Scanner;
import java.util.Random;
class ArrayMethods
{
   public static void main(String [] args)
   {
       int[] Array=new int[5];//Declares an array of size 5
       for(int i=0;i<5;i++)//Initializes the array with random numbers
       {
           int low=1,high=100;
           Random rn=new Random();
           int num=rn.nextInt((high-low)+1)+low;//Stores the random value in varaible num
           Array[i]=num;//Stores the value of num in array at index i 
       }
       System.out.print("Original array: ");
       for(int i=0;i<4;i++)
       {
           System.out.print(Array[i]+", ");
       }
       System.out.print(Array[4]);
       System.out.println();
       System.out.println("Max value: "+arrayMax(Array));//Prints the maximum value of an array
       System.out.println("Min value: "+arrayMin(Array));//Prints the minimum value of an array
       arraySquared(Array);//Calls method arraySquared
       arrayReverse(Array);//Calls method arrayReverse
       
   }
   
   public static int arrayMax(int[] arr)
   {
       int max=0;
       for(int i=0;i<5;i++)
       {
           if(arr[i]>max)
           {
              max=arr[i];
           }
       }
       return max;//Returns the maximum value of the array
   }
   public static int arrayMin(int[] arr)
   {   int min=100;
       for(int i=0;i<5;i++)
       {
           if(arr[i]<min)
           {
               min=arr[i];
           }
       }
       return min;//Returns the minimum value of the array
   }
   public static void arraySquared(int[] arr)
   {
      System.out.print("Squared array: ");
      for(int i=0;i<4;i++)
      {
         System.out.print((arr[i]*arr[i])+" ,");
      }
      System.out.println(arr[4]*arr[4]);
   }
   public static void arrayReverse(int[] arr)
   {   
       System.out.print("Reversed array: ");
       for(int i=4;i>0;i--)
       {
          System.out.print((arr[i]*arr[i])+" ,");
       }
       System.out.print(arr[0]*arr[0]);
   }
         
  }


       