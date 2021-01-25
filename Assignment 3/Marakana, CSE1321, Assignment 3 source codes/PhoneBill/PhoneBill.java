import java.util.Scanner;
class PhoneBill
{
    public static void main(String [] args)
    {
         Scanner sc=new Scanner(System.in);//Takes the user input for the account number,service doe and the number of minutes
         System.out.print("Enter an account number: ");//Asks the user to enter the account number
         int acc_no=sc.nextInt();//Stores the value of account number in variable acc_no
         System.out.print("Enter a service code: ");//Asks the user to enter the service code
         char s_code=sc.next().charAt(0);//Stores the value of source code in s_code
         System.out.println("Account number: "+acc_no);
         double fee;
         
         
         if(s_code=='r' ||s_code=='R'){
            System.out.print("Enter the number of minutes: ");//Asks the user to enter the number of minutes
            int min=sc.nextInt();//Stores the number of minutes in variable min
            System.out.println("Service type: Regular");
            System.out.println("Total minutes: "+min);
            
            if(min<=50){
               fee=15.00;
            }
            else{
              fee=15.00+(min-50)*0.50;
            }
            System.out.println("Amount due: $"+fee);
          }
         
         
         
         if(s_code=='p' ||s_code=='P'){
            System.out.println("Service type= Premium");
            System.out.print("Enter the number of minutes on call between 6:00am to 6:00pm: ");//Asks the user to enter the number of daytime minutes
            int day_min=sc.nextInt();//Stores the value of daytime minutes in day_min
            System.out.print("Enter the number of minutes on call from 6:00pm to 6:00am: ");//Asks the user to enter the number of nighttime minutes in night_min
            int night_min=sc.nextInt();//Stores the value of nighttime minutes in night_min 
            System.out.println("Daytime minutes: "+day_min);
            System.out.println("Nighttime minutes: "+night_min);
            
                if(day_min<=50){
                    fee=0.00;
                }
                else{
                   fee=(day_min-50)*0.20;
                }
            
               if(night_min<=100){
                   fee=0.00;
               }
               else{
                 fee=(night_min-100)*0.10;
               }
             System.out.println("Amouunt due: $"+fee);}
         
       }
}
            
            
            
            
            
            
               
          