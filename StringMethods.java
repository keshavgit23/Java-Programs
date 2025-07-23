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
}
