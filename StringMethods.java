//char charAt(int i)
class Main
{
	public static void main (String[] args)
	{
	 String s ="Java String charAt() example";
	 for(int i = 0;i<s.length();i++)
	 {
	     System.out.println(i +" " +s.charAt(i));
	 }
	 System.out.println(s.charAt(8));
	 
	char ch = s.charAt(25);
	 System.out.println(ch);
 //Output: p
	}
}

//String substring(int i):-
class Main
{
	public static void main (String[] args)
	{ 
	    
	    String s = "Java Programming is Best";
	    String sub =  s.substring(5,16);
	    System.out.println(sub);
	   //Output: Programming 

	}
}

//indexOf() method:-
//Variant 1):-
//indexOf(char ch,int strt)

public class Index1 {
  
    public static void main(String args[]) {
      
        String s = new String("Welcome to Java Programming");

      for(int i =0;i<s.length();i++)
        {
        System.out.println(i + " " +s.charAt(i));
        }
      
      
   System.out.println("Found a after 9th index at position: ");

        System.out.println(s.indexOf('a', 9));
      //Output: Found 'a' after 9th index at position: 12th
    }
}

//Variant 2) indexOf(String str):-
public class Index2{
  
    public static void main(String args[]) {
      
        String s = new String("Welcome to Java Programming");

        // Initializing search string
        String s1 = new String("Java");

        // print the index of initial character of Substring
        System.out.print(
            "Found Java starting at position: ");
        System.out.print(s.indexOf(s1));
     //Output: Found Java starting at position: 11th
    }
}

//Variant 3) indexOf(String str,int strt):-

public class Index3 {
  
    public static void main(String args[]) {

        String s = new String("Welcome to JavaProgramming");

        // Initializing search string
        String s1 = new String("Java");

        // print the index of initial character
        // of Substring after 5th position
        System.out.print(
            "Found Java(after 5th index) starting at position: ");
        System.out.print(s.indexOf(s1, 5));
 //Found Java (after 5th index)  starting at position: 11th 
    }
}

//lastIndexOf():-
class Main
{
	public static void main (String[] args) 
	{
       String str = new String("Welcome to Java Programming");
       
       //lastIndexOf(char ch)
        char ch = 'm';
       System.out.println("Found last index of character " + ch +" = "+ str.lastIndexOf(ch));
        
        //lastIndexOf(char ch,int fromIndex)
        //fromIndex seacrches backward //from given index 
         char ch1 = 'a';
      System.out.println("Found last index of character " + ch1 + " = " + str.lastIndexOf(ch1,6));
      
      //lastIndexOf(String str)
      String str1 = new String("ramm");
      System.out.println("Found last index of String " + str1 +" = "+str.lastIndexOf(str1));
     
     //lastIndexOf(String str, int fromIndex) 
      String str2 = new String("ava");
      System.out.println("Found last index of String " + str2 +" = "+str.lastIndexOf(str2,4));
      
      
     // Found last index of character m = 23
     //Found last index of character a = -1 
     //Found last index of String ramm = 20
     //Found last index of String ava = -1
	}
}

//Boolean equals():-
class Main
{
public static void main (String[] args) 
	{
	  Boolean a = new Boolean(true);
	  Boolean b = new Boolean(true);
	  System.out.println(a.equals(b));
	  //true

         Boolean c = new Boolean(true);
         Boolean d = new Boolean(false);
         System.out.println(c.equals(d));
         //false
     
     Boolean e = new Boolean(false);
     Boolean f = new Boolean(true);
     System.out.println(e.equals(f));
     //false
     
     Boolean g = new Boolean(false);
     Boolean h = new Boolean(false);
     System.out.println(g.equals(h));
     //true  
	}
}

//Boolean equalsIgnoreCase(String anotherString):-

class Main
{
	public static void main (String[] args) 
	{
	  String str1 = "JaVA";
	  String str2 = "jAvA";
	  String str3 = "jiVa";
	  
	  System.out.println("str1 is equal to str2 = " +str1.equalsIgnoreCase(str2));
          System.out.println("str3 is equal to str2 = " + str3.equalsIgnoreCase(str2));
          System.out.println("str1 is equal to str3 = " + str1.equalsIgnoreCase(str3));
      
      //str1 is equal to str2 = true
      //str3 is equal to str2 = false
      //str1 is equal to str3 = false
      
	}
	
//trim() method:-
//Variant 1:-

import java.io.*;

class Main {
    
    public static void main (String[] args) {
      
          // Three strings declared
          String x = "pali ";
          String y = "  ndr ";
          String z = " ome";
      
          // Printing without trim function
          System.out.println(x + y + z);
      
          // Using trim function to get result
          System.out.println(x.trim() + y.trim() + z.trim());
    //Output:
  //pali ndr ome
//palindrome
    }
}

//Variant 2:-
//Original String v/s Trimmed String

public class Trim {
  
    public static void main(String args[]) {
      
        // String with leading and trailing spaces
        String s = "  Hello Java Programming  ";
        // Printing String after removing the whitespaces
        System.out.println("Trimmed string: \n" + s.trim());

        // Printing string to observe original string
        System.out.println("Original String: \n" + s);

    //Trimmed string: 
  //Hello Java Programming 
//Original String:
//  Hello Java Programming 
    }
		  }
}


//toLowercase(Locale loc):-
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Locale;

class Main
{
	public static void main (String[] args) 
	{
		String s = "I LIke CodIng";
		
		Locale ENGLISH = Locale.forLanguageTag("en");
		Locale TURKISH = Locale.forLanguageTag("tr");
		
	  String str1 = s.toLowerCase(ENGLISH );
	  String str2 = s.toLowerCase(TURKISH);
	  
	  System.out.println("English: " + str1 + "\n" + "Turkish: " + str2);
		
		
        	//Output English: i like coding
           // Turkish: ı lıke codıng

	}
}

//toUpperCase(Locale loc):-
import java.util.Locale;

class Geeks 
{
    public static void main(String args[]) 
    {
        // Custom input string
        String str = "i love coding";

        // Locales with the language "tr" for TURKISH
        //"en" for ENGLISH is created
        Locale TURKISH = Locale.forLanguageTag("tr");
        Locale ENGLISH = Locale.forLanguageTag("en");

        // Converting string str to uppercase letter
        // using TURKISH and ENGLISH language
        String strup1 = str.toUpperCase(TURKISH);
        String strup2 = str.toUpperCase(ENGLISH);
      
        System.out.println(strup1);
        System.out.println(strup2);
     // Turkish: İ LOVE CODİNG 
    // English:  I LOVE CODING
    }
}

//String replace():-

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		String originalString = "Java Programming language";
		
		String replacedString = originalString.replace("a","m");
		
	System.out.println("Original String: " + originalString + "\n");
		System.out.println("Replace o with m in Original String: " + "\n" + replacedString);
		
		String str = "Python";
		String newReplaced = originalString.replace("Java",str);
		System.out.println("After replacing Java with Python: "+ newReplaced);
	}
}

