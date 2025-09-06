@FunctionalInterface 
 interface Vehicle
 {
     public void brakes();
 }
  
 class Car implements Vehicle
  {
     @Override
     public void  brakes()
      {
          System.out.println("Car have brakes.");
      }
  }
  
  class Cycle implements Vehicle 
  {
      @Override 
      public void brakes()
       {
           System.out.println("Cycle also have brakes.");
       }
  }
  
  class Main{
   public static void main (String[] args) {
       
      Vehicle[] vehicles = {new Car(),new Cycle()};
      
      for(Vehicle v:vehicles)
      {
          v.brakes();
      }
   }
}
