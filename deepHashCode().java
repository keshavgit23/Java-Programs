import java.util.Arrays;

class Main
{
	public static void main (String[] args)
	{
		String[][] o1 = {{"x","y"},{"z"}};
		
		String[][] o2 = {{"x","y"},{"z"}};
		
		System.out.println("Deep Hash Code on o1:"+Arrays.deepHashCode(o1));
		System.out.println("Deep Hash Code on o2:"+Arrays.deepHashCode(o2));

	}
}

#Added DeepHashCode() program 
