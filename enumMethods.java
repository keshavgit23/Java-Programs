// Normal enum Method:-

enum IceCream
   {
       VANILLA,CHOCOLATE;
       
       public void msg1()
       {
           System.out.println("This is Vanilla IceCream ");
       }
       public void msg2()
       {
           System.out.println("This is Chocolate IceCream");
       }
   }
   
   class enumMethodType1
    {
        public static void main(String[] args)
        {
            IceCream.VANILLA.msg1();
            IceCream.CHOCOLATE.msg2();
        }
      }

// Enum with fields + getters + methods:-

enum IceCream
  {
      VANILLA(50),
      CHOCOLATE(60),
      STRAWBERRY(70);
      
      private int price;
      
      IceCream(int price)
      {
          this.price = price;
      }
      
      public int getPrice()
       {
           return price;
       }
       
       public boolean isCostly()
       {
           return price>50;
       }
  }
  
  class enumWithGetter
    {
        public static void main(String[] args)
        {
            for(IceCream ic:IceCream.values())
            {
                System.out.println(ic + "->" + ic.getPrice() + " |isCostly? " +  ic.isCostly());
            }
        }
  }
 // Enum with abstract methods:-

enum IceCream
{
    
    VANILLA{
        @Override
        public void price()
          {
              System.out.println("Price of Vanilla IceCream is 50 rs");
          }
    },
    CHOCOLATE{
        @Override
        public void price()
        {
            System.out.println("Price of Chocolate IceCream is 100 rs");
        }
    },
    STRAWBERRY{
        @Override
        public void price()
          {
              System.out.println("Price of Strawberry Ice-Cream is 70 rs");
          }
    };
   public abstract void price();
}
class enumOverriding{
    public static void main(String[] args){
        IceCream.VANILLA.price();
        IceCream.CHOCOLATE.price();
        IceCream.STRAWBERRY.price();
    }
}
