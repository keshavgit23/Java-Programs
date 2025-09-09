import java.util.*;
import java.util.function.Function;
import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
Function<Integer,Integer>square = new Function<Integer,Integer>(){
		    @Override
		    public Integer apply(Integer n)
		    {
		        return n*n;
		    }
		};
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int result = square.apply(number);
		System.out.println("Square of " + number + " is " + result);
	}
}
