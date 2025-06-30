class Main
{
	public static void main (String[] args) 
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Array Length:"+arr.length);
		
		//Accessing elements through for loop
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println("Element at Index["+i+"]:"+arr[i]);
		}
		
		//Accessing elements through for- each loop 
		for(int e:arr)
		{
		    System.out.println("Element of Array:"+e+" ");
		}
	}
}
