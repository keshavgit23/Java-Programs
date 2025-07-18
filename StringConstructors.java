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
