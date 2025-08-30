import java.util.*;

enum IceCream{
    VANILLA, 
    CHOCOLATE,
    PINEAPPLE,
    ORANGE,
    STRAWBERRY;
}
class Test{
    public static void main(String[] args)
    {
        IceCream I = IceCream.VANILLA;
        System.out.println(I);
        System.out.println();
        //For-loop
        System.out.println("Using For loop");
        
        for(IceCream I1:IceCream.values())
        {
            System.out.println(I1);
        }
        
        System.out.println();
        switch(I){
            case VANILLA:
                System.out.println("Vanilla Flavor");
                break;
                
            case CHOCOLATE:
                System.out.println("Chocolate Flavor");
                break;
                    
            case PINEAPPLE:
                System.out.println("Pineapple Flavor");
                break;
                        
            case ORANGE:
                System.out.println("Orange Flavor");
                break;
                            
            case STRAWBERRY:
                System.out.println("Strawberry Flavor");
                break;
                                
            default:
                System.out.println("Other Flavor");
        }
    }
}

  /* VANILLA

   Using For loop
   VANILLA
   CHOCOLATE
   PINEAPPLE
   ORANGE
   STRAWBERRY

   Vanilla Flavor */
