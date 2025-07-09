import java.util.Arrays;

class Main
{
	public static void main (String[] args) 
	{
	int[] intArr = {10,20,30,40,50};

    int[] intArr1 = {10,30,40,50,50};
	
	System.out.println("Index where first mismatched element:"+ Arrays.mismatch(intArr,intArr1));
	}
}

# Added mismatch program
