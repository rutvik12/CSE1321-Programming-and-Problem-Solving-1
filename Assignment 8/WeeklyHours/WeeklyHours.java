import java.util.Random;
import java.util.Arrays;
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
              int num=rn.nextInt(11);//Stores random integers in variable num 
              Hours[i][j]=num;//Stores num in array
          }
       }
       
       System.out.println("Employees Data: ");
       System.out.println("           Mon  Tue  Wed  Thu  Fri  Sat  Sun"); 
       System.out.print("Employee1  ");
       for(int l=0;l<7;l++)
       {  
          System.out.print(Hours[0][l]+"    ");//Prints the hours worked by employee1
       }
       System.out.println();
       System.out.print("Employee2  ");
       for(int l=0;l<7;l++)
       {
         System.out.print(Hours[1][l]+"    ");//Prints the hours workedd by employee2
       }
       System.out.println();
       System.out.print("Employee3  ");
       for(int l=0;l<7;l++)
       {  
          System.out.print(Hours[2][l]+"    ");//Prints the hours worked by employee3
       }
       System.out.println();
       System.out.println();
       addHours(Hours);
    }
    public static void addHours(int[][] hours)
    {   
        int[] a=new int[7];
        int[] b=new int[7];
        int[] c=new int[7];
        String[] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int add1=0,add2=0,add3=0;
        for(int i=0;i<7;i++)
        {  
           a[i]=hours[0][i];
           add1=add1+hours[0][i];//Adds the hours worked by employee1
        }
        for(int i=0;i<7;i++)
        {
           b[i]=hours[1][i];
           add2=add2+hours[1][i];//Adds the hours worked by employee2
        }
        for(int i=0;i<7;i++)
        {
           c[i]=hours[2][i];
           add3=add3+hours[2][i];//Adds the hours worked by employee3
        }
        int[] sum=new int[3];
        sum[0]=add1;
        sum[1]=add2;
        sum[2]=add3;
        
        int max1 = a[0];
        int max2 = b[0];
        int max3 = c[0];
        int index1=0,index2=0,index3=0;
        
         for(int i = 0; i < a.length; i++)
         {
            if(a[i] > max1)
            {
              max1 = a[i];//Stores the maximum value of array in variable max1
              index1 = i;
            }
         }
         
         for(int i = 0; i < b.length; i++)
         {
             if(b[i] > max2)
             {
                max2 = b[i];//Stores the maximum value of array in varaible max2
                index2 = i;
             }
         }
         
         for(int i = 0; i < c.length; i++)
         {
             if(c[i] > max3)
             {
                max3 = c[i];//Stors the maximum value of array in variable max3
                index3 = i;
             }
         }
      System.out.println("Employee1 worked most hours on " + days[index1]);
      System.out.println("Employee2 worked most hours on " + days[index2]);
      System.out.println("Employee3 worked most hours on " + days[index3]);
      System.out.println();
      
      System.out.println("Employee#     Weekly Hours");
        for(int i=0;i<2;i++)
        {
           for(int j=1;j<3;j++)
           {
             if(sum[i]>sum[j])
             {
                int temp=sum[j];
                sum[j]=sum[i];
                sum[i]=temp;
             }
          }
        }
        if(sum[0]==add1)
        {
           System.out.println("     1           "+sum[0]);
        }
        else if(sum[0]==add2)
        {
           System.out.println("     2           "+sum[0]);
        }
        else
        {  
           System.out.println("     3           "+sum[0]);
        }
        
        if(sum[1]==add3)
        {
           System.out.println("     3           "+sum[1]);
        }
        else if(sum[1]==add2)
        {
           System.out.println("     2           "+sum[1]);
        }
        else
        {
           System.out.println("     1           "+sum[1]);
        }
           
      
        if(sum[2]==add2)
        {
           System.out.println("     2           "+sum[2]);
        }
        else if(sum[2]==add1)
        {
           System.out.println("     1           "+sum[2]);
        }
        else
        {
           System.out.println("     3           "+sum[2]);
        }
    }
}
        

      