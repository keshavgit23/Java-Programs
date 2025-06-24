import java.util.Scanner;

class Factorial 
{
    static void isfact(int n)
    {
        int f = 1;
        for(int i=1;i<=n;i++)
        {
         f*=i;
        }
        System.out.println("Factorial of given number = "+f);
    }
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	isfact(4);
	 
	sc.close();
 
	}
}

# Added Factorial program 
