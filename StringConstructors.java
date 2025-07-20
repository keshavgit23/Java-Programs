//String(byte[] byte_arr)
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
	 byte[] byte_arr = {45,67,38,90,98,89};
	 String str = new String(byte_arr);
	 System.out.println(str);

	}
}

//String(byte[] byte_arr,Charset char_arr)
import java.nio.charset.Charset;


class Main
{
	public static void main (String[] args)
	{
		byte[] bytes = "जावा".getBytes(Charset.forName("UTF-8"));
		String decoded = new String(bytes,Charset.forName("UTF-8"));
		System.out.println(decoded);
		
		//Output: जावा

	}
}

//String(byte[] byte_arr,int start_index,int length)
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		byte[] bytes = {20,56,78,69,11,89,58};
		String str = new String(bytes,2,5);
       System.out.println(str);
  }

//String(byte[] byte_arr,int start_index,int length, Charset char_set)
import java.lang.*;
import java.io.*;
import java.nio.charset.Charset;
class Main
{
	public static void main (String[] args)
	{
	  byte[] byte_arr = {'A','C','D','K','M','G','F','E'};
	  String str = new String(byte_arr,2,4,Charset.forName("UTF-8"));
	  System.out.println(str);
	  //Output: DKMG

	}
}

//String(char[] char_arr)
import java.lang.*;
import java.io.*;
import java.nio.charset.Charset;
class Main
{
	public static void main (String[] args)
	{
	  char[] char_arr = {'A','C','D','K','M','G','F','E'};
	  String str = new String(char_arr);
	  System.out.println(str);
	  
    //Output: ACDKMGFE

	}
}

//String(char[] char_arr,int start_index,int count)
import java.lang.*;
import java.io.*;
import java.nio.charset.Charset;
class Main
{
	public static void main (String[] args)
	{
	  char[] char_arr = {'A','C','D','K','M','G','F','E'};
	  String str = new String(char_arr,1,5);
	  System.out.println(str);
	  //Output: CDKMG

	}
}

//String(int[] uni_code_points,int offset,int count)
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
	  int[] uni_code_points = {77,101,88,93,83,70};
	  String str = new String(uni_code_points,1,5);
	  System.out.println(str);

	}
}

//String to Unicode
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
	  String s = "Java";
	  System.out.println((int)s.charAt(2));
	  System.out.println((int)s.charAt(1));
	  System.out.println((int)s.charAt(0));
	  System.out.println((int)s.charAt(3));
	}
}


