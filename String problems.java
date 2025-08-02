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


