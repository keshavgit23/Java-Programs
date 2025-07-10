import java.util.Arrays;
import java.util.Collections;
class Main
{
	public static void main (String[] args)
	{
	    Integer[] arr = {1,3,5,2,7,8}; 
	    
	    Arrays.sort(arr,Collections.reverseOrder());
	    
	    System.out.println("Integer array sorted in descending order:"+ Arrays.toString(arr));
	    
	    //Output: Integer array sorted in descending order:[8, 7, 5, 3, 2, 1]

	}
}

#Added Desending Sort program
