import java.util.Arrays;

class Main
{
	public static void main (String[] args)
	{
		Object[][] o1 = {new String[]{"x","y"}};
		
		Object[][] o2 = {new String[]{"x","y"}};
		
		System.out.println("Two Nested objects on comparison:"+Arrays.deepEquals(o1,o2));

	}
}

#Added Deep Equals() program
