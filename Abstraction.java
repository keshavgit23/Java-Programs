import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

abstract class Sports 
 {
     abstract void funds();
     
 }
class Cricket extends Sports
{
    int y;
    Cricket(int y)
    {
        this.y = y;
    }
    @Override
    void funds()
    {
    
        System.out.println("Government approved " + y + " to Cricket");
    }
}
class Football extends Sports
{
    int x;
    Football(int x)
    {
      this.x=x;  
    }
     @Override
     void funds()
     {
       System.out.println("Government approved " + x + " to Football");
     }
}
class Chess extends Sports
{
    int z;
    Chess(int z)
    {
        this.z=z;
    }
    @Override
    void funds()
    {
        System.out.println("Government approved " + z + " to Chess");
    }
}
  class Main 
  {
	public static void main (String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 int y = sc.nextInt();
	 int x = sc.nextInt();
	 int z = sc.nextInt();
	 
	 Sports sp = new Cricket(y);
	 sp.funds();
	 Sports sp1 = new Football(x);
	 sp1.funds();
	 Sports sp2 = new Chess(z);
	 sp2.funds();

	}
}
/* Government approved 1000000 to Cricket
   Government approved 600000 to Football
   Government approved 300000 to Chess */
