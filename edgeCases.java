//HollowSquare program with size of Square handling:-
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Program to print Hollow star pattern");
		
		System.out.println("Enter Size of n:");
		int n = sc.nextInt();
		System.out.println("n = " + n);
		if(n<1)
		{
		    System.out.println("Size of n is too Small!");
		}else if(n>100)
		{
		    System.out.println("Size of n is too Large to display!");
		}else{
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(i==1||i==n||j==1||j==n)
		        {
		            System.out.print("*");
		        }else{
		            System.out.print(" ");
		        }
		      }
		      System.out.println();
		   	}
		}

	}
}

// Filled Square with user InputMismatchException handling:-
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	 System.out.println("Program of Square fill star pattern");
	
	
	 int squareSize;
	 System.out.println("Enter size of square:");
	 
	 try{
	    squareSize = sc.nextInt();
	 }catch(InputMismatchException e){
	     System.out.println("Enter a Valid Integer!");
	     sc.close();
	     return;
	 }
	 
	 
	 if(squareSize<1){
	     System.out.println("Size of square is too small");
	 }else if(squareSize>100){
	     System.out.println("Size of square is too Large to display!");
	 }else{
	 for(int i=0;i<squareSize;i++)
	 {
	     for(int j=0;j<squareSize;j++)
	     {
	         System.out.print(" * ");
	     }
	    System.out.println();
	 }
	 }

  sc.close();
	}
}
