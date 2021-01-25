// Class: CSE 1321L
// Section:09
// Term:Fall 
// Instructor:Shweta Khandal 
// Name:Rutvik Marakana 
// Lab#:Java
class Stock
{
   private String Symbol;
   private String Name;
   private double previousClosingPrice;
   private double currentPrice;
   
   public Stock(String s,String n)
   {
      this.Name=n;
      this.Symbol=s;
   }
   public String getName()
   {
      return this.Name;
   }
   public String getSymbol()
   {
      return this.Symbol;
   }
   public void setClosingPrice(double previousClosingPrice)
   {
      this.previousClosingPrice=previousClosingPrice;
   }
   public void setCurrentPrice(double currentPrice)
   {
      this.currentPrice=currentPrice;
   }
   public double getClosingPrice() 
   {
      return this.previousClosingPrice;
   }
   public double getCurrentPrice()
   {
      return this.currentPrice;
   }

   public double getChangePercent()
   {
      return(this.currentPrice-this.previousClosingPrice)/this.previousClosingPrice*100;
   }
   public String toString()
   {
      
      String name=Name+" stock closing price is "+currentPrice;
      return name;
   }
}
   
   