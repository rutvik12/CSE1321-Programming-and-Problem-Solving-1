class QuadraticEquation 
{
   
   private int a, b, c;
   
   public QuadraticEquation(int a, int b, int c)//Parameterized constructor
   {
   
      this.a = a;
      this.b = b;
      this.c = c;
   
   
   }
   //Getter methods that get the values of a,b,c
   public int getA() 
   {
      return this.a;
   }
   public int getB() 
   {
      return this.b;
   }
   public int getC() 
   {
      return this.c;
   }
   
   public int getDiscriminant()//Method that calculates and returns discriminant
   {
   
      int disc = this.b*this.b - 4*this.a*this.c;
      return disc;
   }
   
   public double getRoot1()//Method that calculates and returns first root of the quadratic equation 
   {
   
      double R1 = (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
      return R1;
   }
   
   public double getRoot2()//Method that calculates and returns the second root of the quadratic equation
   {
   
      double R2 = (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
      return R2;
   }

}