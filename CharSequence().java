import java.lang.String;

class Main
{
	public static void main (String[] args)
	{
	  CharSequence cs = "Vehicle";
	  System.out.println(cs.charAt(2));//h
	  System.out.println(cs.length());//7
	  
	  Comparable<String>cmp ="abc";
	  System.out.println(cmp.compareTo("def"));//-3
	  

	}
}

