import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
	   
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer>transactions = new ArrayList<Integer>();
	int balance =0;
	System.out.println("Enter 5 transactions:");
	for(int i=0;i<5;i++)
	{
	    int amount = sc.nextInt();
	    transactions.add(amount);
	}
	
	System.out.println("            Mini Statement");
	System.out.println("Recent 5 transactions:");
	for(int t:transactions)
	{
	   
	  if(t>=0)
	  {
	      System.out.println("Deposited:"+t);
	}else{
	    System.out.println("Withdrawed:"+t);
	  
	}
	balance+=t;
		 
	}
	System.out.println("Current Balance:"+balance);
}
    }
