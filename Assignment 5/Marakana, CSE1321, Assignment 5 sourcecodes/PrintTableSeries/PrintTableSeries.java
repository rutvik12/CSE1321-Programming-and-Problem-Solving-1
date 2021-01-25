import java.util.Scanner;
class PrintTableSeries
{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);//Takes user input for an integer
       System.out.print("Enter an integer: ");//Asks the user to enter an integer
       double n=sc.nextInt();//Stores the entered integer in variable n
       double i=1,sum=0;
       System.out.println("i      sum(i)");
       while(i<=n)
       {
          sum=displaySums(i);
          System.out.println(i+"     "+sum);    
          i++;
       }
       
       
    }
    public static double displaySums(double k)
    {  
       double sum=0;
       for(double i=1.0;i<=k;i++)
       {
          sum=sum+(i/(i+1));
       }
       return sum;
    }
}