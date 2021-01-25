import java.util.Random;
class WeeklyHours
{
   public static void main(String [] args)
   {
       Random rn=new Random();
       int[][] Hours=new int[3][7];
       for(int i=0;i<3;i++)
       {
          for(int j=0;j<7;j++)
          {
              int num=rn.nextInt(11);
              Hours[i][j]=num;
          }
       }
       System.out.println("Employees Data: ");
       System.out.println("           Mon  Tue  Wed  Thu  Fri  Sat  Sun"); 
       System.out.print("Employee1  ");
       for(int l=0;l<7;l++)
       {
          System.out.print(Hours[0][l]+"    ");
       }
       System.out.println();
       System.out.print("Employee2  ");
       for(int l=0;l<7;l++)
       {
         System.out.print(Hours[1][l]+"    ");
       }
       System.out.println();
       System.out.print("Employee3  ");
       for(int l=0;l<7;l++)
       {
          System.out.print(Hours[2][l]+"    ");
       }
       System.out.println();
       System.out.println();
       addHours(Hours);
    }
    public static void addHours(int[][] hours)
    {
        System.out.println("Employee     Weekly Hours");
        int add1=0,add2=0,add3=0;
        for(int i=0;i<7;i++)
        {
           add1=add1+hours[0][i];
        }
        System.out.println("   1             "+add1);
        for(int i=0;i<7;i++)
        {
           add2=add2+hours[1][i];
        }
        System.out.println("   2             "+add2);
        for(int i=0;i<7;i++)
        {
           add3=add3+hours[2][i];
        }
        System.out.println("   3             "+add3);
    }
 }
        

      