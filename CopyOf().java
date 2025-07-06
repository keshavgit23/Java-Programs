import java.util.Arrays;

class Main
{
	public static void main (String[] args) 
   {
     int[] intArr = {2,4,6,2,7};
     
     System.out.println("Original Integer Array:"+Arrays.toString(intArr));
     
     System.out.println("New Integer Array:"+Arrays.toString(Arrays.copyOf(intArr,8)));
	}
}
