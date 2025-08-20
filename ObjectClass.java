class Bank
{
    private final String customerName;
    
    Bank(String customerName)
    {
       this.customerName = customerName;
    
    }
    
    @Override
    public String toString()
    {
        return "Bank{Customer Name = " + customerName + "}";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj) return true;
        if(!(obj instanceof Bank)) return false;
        Bank b = (Bank)obj;
        return java.util.Objects.equals(this.customerName,b.customerName);
    }
    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(customerName);
    }
    
   
}
   public class Main{
	public static void main (String[] args) 
	{
		Bank b1 = new Bank("Vishal");
		Bank b2 = new Bank("Vishal");
		
	   	String n = "Get Class";
	    
	     System.out.println(b1.toString());
         System.out.println(b1.equals(b2));
         System.out.println(b1.hashCode());
         System.out.println(b2.hashCode());
         System.out.println(b2.getClass());
         System.out.println(b1.getClass());
         System.out.println(n.getClass());
	}
}
  /* Output:- Bank{Customer Name = Vishal}
true
-1732361550
-1732361550
class Bank
class Bank
class java.lang.String */
