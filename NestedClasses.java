class OuterClass {
    static int staticVar = 100;
    int nonStaticVar = 200;

     static class stacticNested{
         void show()
         {
            System.out.println("Static Var: " + staticVar);
         }
         
     }
    class innerNested{
        void show()
        {
            System.out.println("Static Var: "+ staticVar);
            System.out.println("Non-Static Var: " + nonStaticVar);
        }
    }
}
class Main
{
    public static void main(String[] args){
        
        OuterClass.stacticNested sn = new OuterClass.stacticNested();

        sn.show();

        OuterClass out = new OuterClass();
        OuterClass.innerNested in = out.new innerNested();
    in.show();
    }
}
 /* Output: Static Var: 100
            Static Var: 100
            Non-Static Var: 200 */
