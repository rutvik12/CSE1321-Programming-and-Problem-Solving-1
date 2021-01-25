import java.util.Random;
class MinMaxAvg
{
    public static void main(String [] args)
    {  
       Random rn=new Random();
       int[][] Grades=new int[4][4];
       for(int i=0;i<4;i++)
       {
          for(int j=0;j<4;j++)
          {
              int num=rn.nextInt(101);
              Grades[i][j]=num;
          }
       }
       System.out.println("Array Grades:");
       System.out.print("    ");
       for(int i=0;i<4;i++)
       {
          for(int j=0;j<4;j++)
          {
              System.out.print(Grades[i][j]+" ");
          }
          System.out.println();
          System.out.print("    ");
       }
       System.out.println();
       minMaxAvg(Grades);
    }
    public static void minMaxAvg(int[][] grades)
    {
       int min=100,max=0,total=0;
       double avg;
       
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<4;j++)
           {
              if(grades[i][j]>max)
              {
                 max=grades[i][j];
              }
              if(grades[i][j]<min)
              {
                 min=grades[i][j];
              }
              total=total+grades[i][j];
          }
      }
      avg=total/16;
      System.out.println("Highest grade : "+max);
      System.out.println("Lowest grade  : "+min);
      System.out.println("Avergae grade : "+avg);
   }
} 
       
       
              
        