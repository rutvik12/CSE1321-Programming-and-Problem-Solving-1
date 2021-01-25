import java.util.Scanner;
class IncomeTax
{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);//Takes user input for the annual income
       System.out.print("Enter the annual income: ");//Asks the user to enter the annual income
       int income=sc.nextInt();//Stores the annual income in variable income
       System.out.println("Annual income: "+income);
       double tax;
       if(income<=50000){
         System.out.println("Tax bracket: 5%");
         tax=0.05*income;
       }
       else if(50000<income && income<=200000){
          System.out.println("Tax bracket: 10%");
          tax=0.05*50000+(income-50000)*0.1;
       }
       else if(200000<income && income<=400000){
          System.out.println("Tax bracket: 15%");
          tax=0.05*50000+0.1*150000+(income-200000)*0.15;
       }
       else if(400000<income && income<=900000){
          System.out.println("Tax bracket: 25%");
          tax=0.05*50000+0.1*150000+0.15*200000+(income-400000)*0.25;
       }
       else{
          System.out.println("Tax bracket: 35%");
          tax=0.05*50000+0.1*150000+0.15*200000+0.25*500000+(income-900000)*0.35;
       }
       System.out.println("Tax due amount: $"+tax);
   }
}
          
      