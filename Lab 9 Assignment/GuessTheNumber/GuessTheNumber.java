// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
import java.util.Scanner;
import java.util.Random;
class GuessTheNumber
{
    public static void main(String [] args)
    {   String another="y";
        while(another.equalsIgnoreCase("y"))
        {   Scanner sc=new Scanner(System.in);//Takes user input for variable another
    
            int random_num=randomNumber();
            int num=guessNumber();
            String a=correctOrNot(random_num,num);
            while(a!="Your guess is correct")
            {
              num = guessNumber();
              a = correctOrNot(random_num,num);
            }
            
            System.out.println();
            System.out.println("Do you want to play again (y/n): ");//Asks the user whether they want to play again or not
            another=sc.nextLine();//Stores their decision in variable another
          
            
        }
    }
    public static int randomNumber()
    {   int low=1,high=20;
        Random rn=new Random();
        int num=rn.nextInt((high-low)+1)+low;//Assign a random number to variable num
        return num;//Return num to main method
        
    }
    public static int guessNumber()
    {
        Scanner sc=new Scanner(System.in);//Takes user input for variable guess_num
        System.out.print("Guess a number: ");//Asks the user to guess a number
        int guess_num=sc.nextInt();//Stores the value of the entered guess number in varaible guess_num
        return guess_num;//Return guess_num to main method
    }
    public static String correctOrNot(int random_num,int guess_num)
    {   String s;
        if(random_num==guess_num)
        {
           s="Your guess is correct"; 
        }
        else if(random_num<guess_num)
        {
           s="Your guess is too high";
        }
        else
        {
           s="Your guess is too low";
        }
        System.out.println(s);
        return s;
    }
 }
    
        
        
    
            
           