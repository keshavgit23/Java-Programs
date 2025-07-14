import java.util.Arrays;

class Main
{
    
public static void main (String[] args) 
    {
      
      int[] arr = {1,3,5,2,5};
      
      System.out.println("Printing elements:");
      Arrays.stream(arr).forEach(System.out::print);
     
      //Output:Printing elements:
       //13525 
    }
  }

#Added forEach() program
