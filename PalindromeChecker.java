import java.util.Scanner;

class Palindrome
{
    static void isPalindrome(int n)
    {
    int r,reversedNum=0,originalNum;
    originalNum =n;
     
    while(n!=0)
    {
     r = n%10;
     reversedNum = reversedNum*10+r;
     n/=10;
    }

  if(reversedNum==originalNum)
  {
      System.out.println("Number is Palindrome");
  }else{
      System.out.println("Number is not Palindrome");
  }
    }
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in );
	  System.out.println("Enter a number:");
	  int input = sc.nextInt();
	  
	  isPalindrome(input);
	  
	  sc.close();
     }
  }

#Added Palindrome program 
