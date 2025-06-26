import java.util.Scanner;
class Fibonacci 
{
    static void putData(int num)
   {
       int x=0,y=1;
       for(int i=1;i<=num;i++)
       {
           System.out.println(x+" ");
           int z=x+y;
           x=y;
           y=z;
       }
   }
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number:");
      int n = sc.nextInt();
	    putData(n);
	    
	    sc.close();
	}
  }

#Added Fibonacci Series upto 
