import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
    int rollNo;
    String name;
    String address;
    
    Student(int rollNo,String name,String address)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }
    
    public String toString()
    {
        return rollNo+" "+name+" "+address+" ";
    }
    
}
    class SortByRoll implements
    Comparator<Student>{
        public int compare(Student a,Student b)
        {
            return a.rollNo-b.rollNo;
        }
    }
    class sortByName implements 
        Comparator<Student>{
            public int compare(Student a,Student b){
                return a.name.compareTo(b.name);
            }
            
        }
    class sortByaddress implements 
     Comparator<Student>{
         public int compare(Student a,Student b)
         {
             return a.address.compareTo(b.address);
         }
     }
    
    public class Main
    {
        public static void main (String[] args) 
	{
      Student[] arr = {
          new Student(103,"Vansh","Delhi"),
          new Student(102,"Kartik","Pune"),
          new Student(101,"Keona","Noida")
      };
      
      Arrays.sort(arr,new SortByRoll());
      System.out.println("Students sorted by Roll No:"+ Arrays.toString (arr));
      
      System.out.println("\n");
      
      Arrays.sort(arr, new sortByName());
      System.out.println("Students sorted by Name:"+Arrays.toString(arr));
      
      System.out.println("\n");
      
      Arrays.sort(arr,new sortByaddress());
      System.out.println("Students sorted by Address:"+Arrays.toString(arr));
    
          
	}
}

#Added Comparator program
