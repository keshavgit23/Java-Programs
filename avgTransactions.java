import java.util.Scanner;

class Bank
{
   public void  avgTransaction(int[] arr)
   {
       if(arr.length==0)
       {
           System.out.println("Zero Transactions!");
           return;
       }
     
       int sum =0;
       for(int i=0;i<arr.length;i++)
       {
           sum+=arr[i];
       }
       double avg = (double)sum/arr.length;
       System.out.println("Average Transaction : " + avg);
   }
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int[] arr = new int[]{1000,2639,17284,50000,10000};
	    
	    Bank b = new Bank();
	   
	   b.avgTransaction(arr);
	   
	   sc.close();
	    

       
	}
}

#Added Average Transactions program
