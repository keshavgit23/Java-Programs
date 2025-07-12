import java.util.Arrays;
import java.util.Spliterator;

class SpliteratorExample
{
	public static void main (String[] args)
	{
		int[] arr= {10,20,30,40,50};
		
		Spliterator.OfInt split = Arrays.spliterator(arr);
		split.forEachRemaining((int n)->System.out.println(n+" "));
		
		/* Output:10 
              20 
              30 
              40 
              50 */

	}
  }
#Added Spliterator() program
