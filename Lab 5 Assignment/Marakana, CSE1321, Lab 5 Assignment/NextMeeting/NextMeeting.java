// Class:	CSE 1321L
// Section: 09         
// Term:		Fall 
// Instructor:	Shweta Khandal 
// Name:		Rutvik Marakana  
// Lab#:		Java

import java.util.Scanner;
class NextMeeting
{
   public static void main(String [] args)
   {
       Scanner sc=new Scanner(System.in);//Takes user input for day and next_meet
       int day=sc.nextInt();//Stores the user input of today in day
       int next_meet=sc.nextInt();//Stores the days after which the next meeting is scheduled
       
       if (day==0)
       {
          System.out.println("Today is Sunday");
       }
       else if(day==1)
       {
          System.out.println("Today is Monday");
       }
       else if(day==2)
       {
          System.out.println("Today is Tuesday");
       }
        else if(day==3)
       {
          System.out.println("Today is Wednesday");
       }
        else if(day==4)
       {
          System.out.println("Today is Thursday");
       }
        else if(day==5)
       {
          System.out.println("Today is Friday");
       }
        else
       {
          System.out.println("Today is Saturday");
       }
       
       System.out.println("Days to the meeting is "+next_meet+" days");
       
       int mod=next_meet % 7;
       if (mod==0)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Sunday");
         }
         else if (day==1)
         {
            System.out.println("Meeting day is Monday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Tuesday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Wednesday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Thursday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Friday");
         }
         else
         {
            System.out.println("Meeting day is Saturday");
         }
        }
        
        if (mod==1)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Monday");
         }
         else if (day==1){
           System.out.println("Meeting day is Tuesday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Wednesday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Thursday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Friday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Saturday");
         }
         else
         {
            System.out.println("Meeting day is Sunday");
         }
        }
        
        
        if (mod==2)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Tuesday");
         }
         else if (day==1)
         {
            System.out.println("Meeting day is Wednesday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Thursday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Friday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Saturday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Sunday");
         }
         else
         {
            System.out.println("Meeting day is Monday");
         }
        }
        
        if (mod==3)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Wednesday");
         }
          if (day==1)
         {
            System.out.println("Meeting day is Thursday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Friday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Saturday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Sunday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Monday");
         }
         else
         {
            System.out.println("Meeting day is Tuesday");
         }
        }
        
        if (mod==4)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Thursday");
         }
         else if (day==1)
         {
            System.out.println("Meeting day is Friday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Saturday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Sunday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Monday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Tuesday");
         }
         else
         {
            System.out.println("Meeting day is Wednesday");
         }
       }
       
       if (mod==5)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Friday");
         }
         else if (day==1)
         {
            System.out.println("Meeting day is Saturday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Sunday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Monday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Tuesday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Wednesday");
         }
         else
         {
            System.out.println("Meeting day is Thursday");
         }
       }
       
       if (mod==6)
       {
         if (day==0)
         {
            System.out.println("Meeting day is Saturday");
         }
         else if (day==1)
         {
            System.out.println("Meeting day is Sunday");
         }
         else if (day==2)
         {
            System.out.println("Meeting day is Monday");
         }
         else if (day==3)
         {
            System.out.println("Meeting day is Tuesday");
         }
         else if (day==4)
         {
            System.out.println("Meeting day is Wednesday");
         }
         else if (day==5)
         {
            System.out.println("Meeting day is Thursday");
         }
         else
         {
            System.out.println("Meeting day is Friday");
         }
       }
       
    }
}

    
   






       

       

       

       

       

       

       
              