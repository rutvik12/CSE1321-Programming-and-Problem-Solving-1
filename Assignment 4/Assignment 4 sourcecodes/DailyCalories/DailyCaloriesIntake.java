import java.util.Scanner;
class DailyCaloriesAlllowed
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the height(in inches): ");
      double height=sc.nextDouble();
      System.out.print("Enter the weight(in pounds): ");
      double weight=sc.nextDouble();
      System.out.print("Enter the age: ");
      int age=sc.nextInt();
      System.out.print("Enter the gender: ");
      char gender=sc.next().charAt(0);
      System.out.print("Enter the appropriate level of exercise: ");
      int exercise=sc.nextInt();
      double BMR;
      double DCA=0;
      String gen;
      
      if(gender=='F'){
         gen="Female";
         BMR=655+(4.35 * weight) + (4.7 * height) - (4.7 * age );
      }
      else{ gen="Male";
         BMR = 66+(6.23 * weight) + (12.7 * height) - (6.8 * age);
      }
      
      switch(exercise){
         case 1:DCA=BMR*1.2;
                break;
         case 2:DCA=BMR*1.375;
                break;
         case 3:DCA=BMR*1.55;
                break;
         case 4:DCA=BMR*1.725;
                break;
         case 5:DCA=BMR*1.9;
                break;
      }
      
      System.out.println();
      System.out.print(gen+","+height+" inches ,"+weight+" lbs, age "+age+", BMR= "+BMR+", Exercise "+exercise+", DCA: "+DCA);
   }
}

      
      

         
      