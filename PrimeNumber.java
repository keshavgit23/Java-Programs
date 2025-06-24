import java.util.Scanner;

class Prime
{
    static void isPrime(int n)
    {
        int count=0;

            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
          }
        
        if(count==2)
        {
            System.out.println( n + "Number is Prime");
        }else{
            System.out.println( n + "Number is not Prime");
        }
    }
    
	public static void main (String[] args) 
	{
	   Scanner sc = new Scanner(System.in );
	   
	   isPrime(6);
	   
	   sc.close();

	}
}

#Added Prime Number Program
