import java.util.Arrays;

class Main
{
	public static void main (String[] args) 
	{
	int[] intArr = {10,20,30,40,50};
	
	int key = 36;
	
	Arrays.fill(intArr,1,4,key);
	System.out.println("After using .fill():"+ Arrays.toString(intArr));
	}
}

#Added fill program
