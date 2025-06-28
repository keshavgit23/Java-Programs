import java.util.Scanner;

class StrongNumber
{
    static int Factorial(int num)
    {
        int f =1;
        for(int i=1;i<=num;i++)
        {
            f*=i;
        }
        return f;
    }
    static void putData(int num)
    {
       int original=num;
       int n=0;
       int temp = num;
       
       int sum=0;
       temp=num;
       while(temp!=0)
       {
           int digit = temp%10;
           sum+=Factorial(digit);
           temp/=10;
       }
       
       if(sum==original)
       {
           System.out.println(original + " is a Strong Number");
       }else{
           System.out.println(original + " is Not a Strong Number");
       }
    }
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a Number:");
	    int n = sc.nextInt();
	
	putData(n);
	
	sc.close();

	}
}

#Added Strong Number program 
