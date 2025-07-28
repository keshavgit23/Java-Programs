//StringBuffer Constructors:-

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
	StringBuffer sb = new StringBuffer();
	
	sb.append("Default Constructor");
	System.out.println(sb);
	
	StringBuffer sb2 = new StringBuffer(20);
	
	sb2.append("Integer Argument constructor");
	System.out.println(sb2);
	
	StringBuffer sb3 = new StringBuffer("Hello ");
	
	  sb3.append("World");
	  sb3.insert(6,"Java ");
	  sb3.delete(1,3);
	  
	  System.out.println(sb3);


  /*Output: Default Constructor 
            Integer Argument constructor 
            Hlo Java World*/
	}
}
