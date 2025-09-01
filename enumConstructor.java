enum IceCream
{
    VANILLA("White"),
    CHOCOLATE("Brown"),
    STRAWBERRY("Pink");
    
    private String color;
    
    private IceCream(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return color;
    }
}
 class enumConstructor
 {
     public static void main(String[] args)
     {
        for(IceCream flavour:IceCream.values())
        {
            System.out.println(flavour +" is "+ flavour.getColor());
        }
     }
  }
