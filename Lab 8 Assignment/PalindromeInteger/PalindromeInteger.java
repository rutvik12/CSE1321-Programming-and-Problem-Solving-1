//Class- Java
//Section - 09
//Term - Fall 2018
//Instructor - Shweta Khandal
//Name - Rutvik Marakana

import java.util.Scanner;
class PalindromeInteger
{
   public static void main(String [] args)
   {
     Scanner sc=new Scanner(System.in);//Takes user input for a number
     System.out.print("Enter a number: ");//Asks the user to enter a number
     int n=sc.nextInt();//Stores the value of the number in variable n
     reverse(n);
   }
   public static int reverse(int number)
   { System.out.println("Entered number: "+number);
     int sum=0,num;
     int n=number;
     while(number>0)
     {
       num=number%10;
       sum=(sum*10)+num;
       number=number/10;
     }
     boolean j=isPalindrome(n,sum);
      
     if(j==true)
     {
       System.out.println("Judgement: Palindrome");
     }
     else{
       System.out.println("Judgement: Not Palindrome");
     }
     return sum;
   }
   public static boolean isPalindrome(int n,int sum)
   {
     if(n==sum)
     {
       return true;
     }
     else
     {
       return false;
     }
   }
}
 
        