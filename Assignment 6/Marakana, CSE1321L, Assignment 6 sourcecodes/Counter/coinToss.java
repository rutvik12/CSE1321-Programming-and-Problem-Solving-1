class coinToss
{   
    public static void main(String [] args)
   {
         int total=100;
         Counter Head=new Counter();//Creates and object Head of class Counter
         Counter Tails=new Counter();//Creates and object Tails of class Counter
         
         while(total>0)
         { 
            if(Math.random()<0.5)
            {
               Head.increment();//Increments the value of counter for object Head
            }
            else
            {
               Tails.increment();//Increments the value of counter for object Tails
            }
            total--;
         }
         System.out.println("Total number of heads: "+Head.getValue());//Prints the current value of counter for object Head
         System.out.println("Total number of tails: "+Tails.getValue());//Prints the current value of counter for object Tails
   }
}
        
    