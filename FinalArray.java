import java.util.Arrays;

class Student 
{
   
   int marks = 50;
   
	public static void main (String[] args)
	{
  
   final Student s = new Student();
   s.marks = 100;
   
   System.out.println(s.marks);
   // Output:100
  
}
}
