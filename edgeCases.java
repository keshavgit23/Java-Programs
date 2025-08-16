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

// K-Patttern printing with user input symbols
// With Min & Max Size
import java.util.*;

class PatternPrinting
{ 
    public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Program to print K-star Pattern! ");
	  
	  System.out.println("Enter the size of Pattern: ");
	  
	  int size=0;
	 
	 final int MIN_SIZE = 2;
	 final int MAX_SIZE = 100;
	 try{
	      size = sc.nextInt();
	   }  catch(InputMismatchException e)
	     {
	         System.out.println("Enter a Valid Integer Input! ");
	        return;
	     }
	     
	      if(size<MIN_SIZE||size>MAX_SIZE){
	     System.out.println("Enter size between 2-100 ");
	     return;
     	 }
	   
    	 System.out.println("Enter Any Symbol!");
    	 char ch = sc.next().charAt(0);
    	 
    	 PatternPrinting p = new PatternPrinting();
    	 p.kPattern(size,ch);
	 
	 sc.close();
	}
	
	 public void kPattern(int size, char ch)
	 {
     
     for(int i=1;i<=size;i++)
     {
         for(int j=i;j<=size;j++)
         {
             System.out.print(ch+" ");
         }
         System.out.println();
     }
     for(int i=2;i<=size;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(ch+" ");
         }
         System.out.println();
     }
     
  }
}
