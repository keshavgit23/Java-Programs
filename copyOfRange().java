import java.util.Arrays;

class Main
{
	public static void main (String[] args)
	{
	int[] intArr = {10,20,15,30,35};
	
	System.out.println("Integer Array:"+Arrays.toString(intArr));
	
	System.out.println("Integer Array after copyOfRange:");
	System.out.println("Integer Array:"+Arrays.toString(Arrays.copyOfRange(intArr,1,3)));

	}
}

#Added copyOfRange() program


