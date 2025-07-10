//asList() Questions:-
//Convert an array of Strings to a List and print second element
import java.util.Arrays;

class Main
{
	public static void main (String[] args) 
	{
	 String[] fruits = {"apple","banana","mango"};
	 
	 System.out.println("List of fruits = "+Arrays.asList(fruits));
     System.out.println("Element 2nd:"+fruits[1]);
	}
}


//Check if particular element exists in the list
import java.util.Arrays;

class Main
{
	public static void main (String[] args) 
	{
	 String[] fruits = {"apple","banana","mango"};
     
//using for-loop
     for(int i=0;i<fruits.length;i++)
     {
         if(fruits[i].equals("mango")){
         System.out.println("Mango is there!");
         break;
         }   
         
     }
 //using asList() 
    if(Arrays.asList(fruits).contains("mango")){
         System.out.println("Mango is there!");
     }
 }
}


//Add an element to the list created using asList()
import java.util.Arrays;
import java.util.*;

 class Main
{
	public static void main (String[] args) 
	{
	   String[] fruits = {"apple","banana","mango"};
	   
	   List<String>basket = new ArrayList<>(Arrays.asList(fruits));
	   
	   System.out.println(" Original Fruits List:"+basket);
	   
	   basket.add("papaya");
	   
	   System.out.println("Updated fruit to list:"+basket);
	   
	}
}


//binarySearch(array,key) Questions 
//Search an element 22 in sorted array {10,15,20,22,30}.Print index
import java.util.Arrays;

 class Main
{
	public static void main (String[] args) 
	{
	   
	  int[] intArr = {10,15,20,22,30};
	  
	  Arrays.sort(intArr);
	  
	  int intKey = 22;
	 
	  System.out.println("Element at index: "+ Arrays.binarySearch(intArr,intKey));
	}
}

//Try to search an element that doesn't exits in a the array(e.g 25)., a observe output
import java.util.Arrays;

 class Main
{
	public static void main (String[] args) 
	{
	   
	  int[] intArr = {10,15,20,22,30};
	  
	  Arrays.sort(intArr);
	  
	  int intKey = 25;
	 
	  System.out.println("Element at index: "+ Arrays.binarySearch(intArr,0,4,intKey));
	}
}

//Reverse Order String Sort
import java.util.Arrays;
import java.util.Collections;
class Main
{
	public static void main (String[] args)
	{
	    String[] arr = {"Van","Car","Bus","Vehicle","Airplane"}; 
	    
	    Arrays.sort(arr,Collections.reverseOrder());
	    
	    System.out.println("String array sorted in descending order:"+ Arrays.toString(arr));
	    
	    //Output: String array sorted in descending order:[Vehicle, Van, Car, Bus, Airplane]

	}
}

//Custom Class sorting using lambda expression
import java.util.Arrays;
import java.util.Collections;
class Student{
int marks;

   Student(int marks)
   {
       this.marks = marks;
   }
   
   public String toString()
   {
        return String.valueOf(marks);
   }
   
   public static void main(String[] args)
   {
    Student[] marks = {
        new Student(99),
        new Student(78),
        new Student(89),
        new Student(75),
        new Student(67),
        new Student(90),
        new Student(45),
        new Student(69),
    };
    
   Arrays.sort(marks,(s1,s2)->s1.marks-s2.marks);
   System.out.println("Student Marks sorted in Ascending order:"+Arrays.toString(marks));
   Arrays.sort(marks,(s1,s2)->s2.marks-s1.marks);
    System.out.println("Student Marks sorted in Dscending order:" + Arrays.toString(marks));
    
      //Output:
     //Student Marks sorted in Ascending order:[45, 67, 69, 75, 78, 89, 90, 99]
    //Student Marks  sorted in Dscending order:[99, 90, 89, 78, 75, 69, 67, 45]
   }
}

// Converting primitive type int[] to wrapper class Integer[]
import java.util.Arrays;
import java.util.Collections;
class Main{

 public static void main(String[] args)
 {
   int[] arr = {1,2,4,7,4,8,4,9,5,3};
   
   Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
   
   Arrays.sort(boxed);
   System.out.println("Converted int[] to Integer[] array:"+ Arrays.toString(boxed));
   //Output: Converted int[] to Integer[] array:[1, 2, 3, 4, 4, 4, 5, 7, 8, 9]

  }
