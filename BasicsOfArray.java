class Main
{
	public static void main (String[] args) 
	{
	
	//Array Initialization and Assignment
	int[] arr  = new int[5];
	
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
	
	//Element Accessing 
	System.out.println("First Element:"+arr[0]+"\n"+"Last Element:"+arr[4]);
	
	//Overwriting Array Element 
	arr[4] = 60;
	System.out.println("New Last Element:"+ arr[4]);
	
	//Length Property 
	int length = arr.length;
	System.out.println("Lenght of Array:"+ length);
	}     
}

#Added Basics of Array
