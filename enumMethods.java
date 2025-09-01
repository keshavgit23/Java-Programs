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
