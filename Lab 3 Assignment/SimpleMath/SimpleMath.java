// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java

import java.util.Scanner;
class SimpleMath
{
   public static void main(String [] args)
   {
        Scanner sc=new Scanner(System.in);//Reads input values for R and T
        float R=sc.nextFloat();//Stores the input value of R
        float T=sc.nextFloat();//Stores the input value of T
        
        float sum=R + T;//Calculates sum of R and T and stores it in sum
        float difference=R - T;//Calculates the difference of R and T and stores it in difference
        float product=R * T;//Calculates the product of R and T and stores it in product
        
        System.out.println("R ="+R);
        System.out.println("T ="+T);
        System.out.println("R + T = "+sum);
        System.out.println("R - T = "+difference);
        System.out.println("R * T = "+product);
   }
}