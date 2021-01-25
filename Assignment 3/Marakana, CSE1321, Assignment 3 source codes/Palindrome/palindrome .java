import java.util.Scanner;
class PalindromeExample
{  
   public static void main(String args[])
  {  
     int r,sum=0,temp;    
     Scanner sc=new Scanner(System.in);//Takes user input for the number
     System.out.print("Enter a number: ");//Asks the user to enter a number
     int n=sc.nextInt();//Stores the value of number in variable n
     temp=n;    
     while(n>0){    
       r=n%10;  //getting remainder  
       sum=(sum*10)+r;    
       n=n/10;    
     }    
     if(temp==sum && temp>=10000){    
         System.out.println("Valid 5-digit Palindrome");
     }    
     else if(temp<10000){    
         System.out.println("Invalid 5-digit number.Try again");
     }
     else{
        System.out.println("Invalid 5-digit Palindrome");
     }
      
  }  
}  