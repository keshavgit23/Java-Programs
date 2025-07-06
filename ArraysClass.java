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
