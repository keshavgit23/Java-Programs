import java.util.Arrays;
import java.util.Spliterator;

class SpliteratorExample
{
	public static void main (String[] args)
	{
	    Integer[] arr = {10,20,30,40,50,60};//Wrapper class
	    Spliterator<Integer>split1 = Arrays.spliterator(arr);
	    Spliterator<Integer>split2 = split1.trySplit();
	    
	    split1.forEachRemaining(n ->System.out.println("Part 1:"+ n));
	    split2.forEachRemaining(n ->System.out.println("Part 2:"+ n));
	    
	    /* Output:Part 1:30
                Part 1:40
                Part 1:50
                Part 2:10
                Part 2:20 
        */
	}
}
