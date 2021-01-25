class PalindromicPrime
{
   public static void main(String [] args)
   {
         int total =50;
         int displayPerLine = 10;
         int count = 1;
         int number = 2;
         
        while (count <= total)
        {
              if (isPrime(number) && isPalindrome(number))
              {
                 System.out.print(number + " ");//Prints the number if it is a palindromic prime number
              
                 if (count % displayPerLine == 0)//Prints the next number on another line if condition is true
                 {
                   System.out.println();
                 } 
                count++; 
                number++;
              }
              else
              {
                number++;
              }
        }
     }


    public static boolean isPrime(int num)//Method return true if the number is prime
    {      boolean a=true;
           if (num == 2)
           {
                a=true;
           }
           for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                a=false;
                break;
            }
        }
        return a; 

    }
 
     
    public static boolean isPalindrome(int num)//Method return true if the number is a palindrome number
    {   int k=num;
        int test=0;
        while(num != 0)
       {
           int lastdigit=num%10;
           test=test*10+lastdigit;
           num=num/10;
       }
        return (k==test);
    }
}
