class OuterClass{
    int value = 200;
    
    void display()
    {
        final int bonus = 50;// final effectively variable 
        class LocalInner{
            void msg(){
                System.out.println("Value Inside LocalInner = " + value);
                System.out.println("Value + Bonus =  " + (value+bonus));
            }
        }
        //LocalInner Class Object
        LocalInner ln = new LocalInner();
        ln.msg();
    }
}
class Main{
    public static void main(String[] args){
    
    OuterClass out = new OuterClass();
    out.display();
    }
}

/* Value Inside LocalInner = 200
     Value + Bonus = 250 */
