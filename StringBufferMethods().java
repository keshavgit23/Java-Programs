//Capacity() method:-
import java.util.*;

class Main
{
	public static void main (String[] args) 
	{
	  StringBuffer sb = new StringBuffer();
	  //default 16
	System.out.println(sb.capacity());
	sb.append("Java");
	//now 16
   System.out.println(sb.capacity());
   sb.append("Java is programming Language");
   //capacity 34 (oldCapacity*2)+2
   System.out.println(sb.capacity());
   sb.append("Python is dynamic language");
  //now 70
   System.out.println(sb.capacity());
	}
}

//Reverse() method:-

import java.util.*;

class Main
{
	public static void main (String[] args) 
	{
	  StringBuffer sb = new StringBuffer();
	  
	sb.append("Java");
	
	System.out.println(sb.reverse());
	//avaJ
	}
}

//Replace() method:-

import java.util.*;

class Main
{
	public static void main (String[] args) 
	{
		StringBuffer sb = new StringBuffer("Java");
		
		String str = "Programming";
       System.out.println(sb.replace(0,4,str));
       //sb.replace(int strt,int end,String str)
       //Output: Programming 
		

	}
}

   
