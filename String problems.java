//1) Iterate over the characters of String 
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args)
	{
	  String str ="Java Programming";
	  
	  for(int i=0;i<str.length();i++)
	  {
	      System.out.print(i+" = " +str.charAt(i)+" ");
	  }

	}
}
//0 = J 1 = a 2 = v 3 = a 4 = 5 = P 6 = r 7 = //o 8 = g 9 = r 10 = a 11 = m 12 = m 13 = i //14 = n 15 = g 

//2) Remove first and last character of a String
import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args)
	{
	  String str ="Java Programming";

      System.out.println("Original String:" + str);
      StringBuffer sbr = new StringBuffer (str);
      
      sbr.delete(str.length()-1,str.length());
      sbr.delete(0,1);
      
     System.out.println("After deleting first and last character in of string");
     System.out.println(sbr);

	}
}
//Original String:Java Programming
//After deleting first and last character in of string: ava Programmin

//3) Check a String is Palindrome
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Main
{
	public static void main (String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a String:");
	  String str = sc.next();
	  
	  StringBuffer sbr = new StringBuffer (str);
	  System.out.println("Original String = " + sbr);
	  StringBuffer sbr1 =  new StringBuffer(sbr).reverse();
	  
	  System.out.println("Reversed String = " + sbr1);
	  
	  if(sbr.toString().equalsIgnoreCase(sbr1.toString()))
	  {
	      System.out.println("String is Palindrome");
	  }else{
	      System.out.println("String is not Palindrome");
	  }
	 
		}
}

// 4) Count occurrences of characters in a string
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
	  String s = "Programming";
	  char[] ch = s.toCharArray();
	  boolean[] b = new boolean[ch.length];
	  
	  for(int i=0;i<ch.length;i++)
	  {
	      if(b[i]) continue;
	      int c=1;
	      for(int j=i+1;j<ch.length;j++)
	      {
	          if(ch[i]==ch[j]){
	          c++;
	          b[j] = true;
	         }
	      }
	         System.out.println(ch[i] + ":" + c);
	  }

	}
}

    /*P:1
      r:2
      o:1
      g:2
      a:1
      m:2
      i:1
      n:1*/

// 5) Removing leading zeros  from a string:-

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    static void leadingZeros(String s,StringBuffer sb)
    {
        int i;
        
        for(i=0;i<s.length() && s.charAt(i)=='0';i++){
    
           }
        
        sb.replace(0,i,"");
        
        System.out.println("After removing leading zeros: " + sb.toString());
    }
	public static void main (String[] args)
	{
	  Scanner sc = new Scanner(System.in );
	  System.out.println("Enter a String: ");
	  String s = sc.next();
	  
	  StringBuffer sb = new StringBuffer(s);
	  leadingZeros(s,sb);
	  sc.close();
	  
	  /*Enter a String: 
After removing leading zeros: 728383*/

	}
}

// 6)Swap strings without using third variable:-
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String firstString = sc.next();
		System.out.println("Enter Second String");
		String secondString = sc.next();
		System.out.println("Before Swapping:");
		System.out.println("First String = " + firstString);
		System.out.println("Second String = " + secondString);
		
		String c= firstString.concat(secondString);
		
		System.out.println("After Swapping:");
		String a = c.substring(firstString.length());
		System.out.println("First String = " + a);
		String b = c.substring(0,firstString.length());
		System.out.println("Second String = " + b);
		sc.close();

	}
}
 /* Before Swapping:
First String = Java
Second String = Programming
After Swapping:
First String = Programming
Second String = Java */

