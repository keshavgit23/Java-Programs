import java.util.Scanner;

class demo
{
    public int show(int A, int B)
    {
        return A*B;
    }
    
    public double show(double C, double D)
    {
        return C+D;
    }
    
    public void show_1()
    {
        System.out.println("Super Class method");
        }
}

  class demo1 extends demo {
     @Override
    public void show_1()
  {
      super.show_1();
      
      System.out.println("Sub Class method");
  }
  }
class Polymorphism 
{
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in );
	  
	  System.out.println("Enter first number: ");
	  int num1 = sc.nextInt();
	  System.out.println("Enter second number: ");
	  int num2 = sc.nextInt();
	  System.out.println("Enter third number: ");
	  double num3 = sc.nextDouble();
	  System.out.println("Enter fourth number: ");
	  double num4 = sc.nextDouble();
	  
	  demo d = new demo();
	  System.out.print("Multipication of first and second number:" +d.show(num1,num2));
	  System.out.println();
	  System.out.println("Addition of third and fourth nunber: " +	 
	  d.show(num3,num4));
	  
	  demo d1 = new demo1();/* reference of superclass and object of subclass */
	  
	  d1.show_1();
	  
	  sc.close();
	  
/*Multipication of first and second number:200
Addition of third and fourth nunber: 12.7
Super Class method
Sub Class method*/

	}
}
