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
   //Output:p
	}
}

// String substring(int i)
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

//indexOgMethod():-
//Variant1 indexOf(Char ch, int strt)
class Index1 {
  
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
//Variant2 indexOf(String str)
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

//Variant3 indexOf(String s, int strt)
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
