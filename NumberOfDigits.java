import java.util.Scanner;

public class Main{

     static int countDigits(int num)
     {
        int count=0;
        
        if(num==0)
        return 1;
        
       num = Math.abs(num);
       while(num>0)
       {
           num=num/10;
           count++;
       }
       return count;
     }


	public static void main (String[] args) 
	{
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a Number:");
     int num = sc.nextInt();
     
     int result = countDigits(num);
     System.out.println("Number of Digits = "+result);
     
     sc.close();
	}
     }

#Added Number of Digits program
